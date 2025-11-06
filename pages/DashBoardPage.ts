import { Page } from '@playwright/test';
import { DashboardPageLocators } from '../constantes/locators';
import { promises as fs } from 'fs';



export class DashBoard {


    constructor(private page: Page) { }

    async getallproductsname(): Promise<string[]> {
        const productElements = this.page.locator(".card-body a");
        await this.page.waitForSelector(".card-body a", { state: 'visible' });
        //await this.page.locator(".card-body b").first().waitFor();
        const count = await productElements.count();
        const names: string[] = [];
        for (let i = 0; i < count; i++) {
            const name = await productElements.nth(i).textContent();
            if (name) names.push(name.trim());

        }

        return names;
    }
    async saveProductNamesToFile(filePath: string) {
        const names = await this.getallproductsname();
        const data = { products: names };
        await fs.writeFile(filePath, JSON.stringify(data, null, 2));
    }

    async addProductToCart(productName: string) {
        const cards = this.page.locator('app-card');
        const count = await cards.count();

        for (let i = 0; i < count; i++) {
            const cardText = await cards.nth(i).textContent();
            if (cardText?.includes(productName)) {
                await cards.nth(i).getByRole('button', { name: 'Add' }).click();
                break;
            }
        }
    }
    
async clickcheckout(){
    await this.page.getByText('Checkout ( 1 ) (current)').click();
}

}