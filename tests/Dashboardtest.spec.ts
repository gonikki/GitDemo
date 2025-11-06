import { test, expect } from '@playwright/test';
import { LoginPageLocators } from '../constantes/locators';
import loginData from '../data/DashboardData.json';
import { LoginPage } from '../pages/LoginPage';
import { DashBoard } from '../pages/DashBoardPage';
import dashboardData from '../data/dashboardproductData.json';


test.describe('Login Tests', () => {
    for (const data of loginData) {
        test(`Login test for ${data.testid}`, async ({ browser }) => {

            const context = await browser.newContext();
            const page = await context.newPage();

            const loginpage = new LoginPage(page);
            await loginpage.naviagteToLoginpage();
            await loginpage.enterusername(data.username);
            await loginpage.enterpassword(data.password);
            await loginpage.selectUserType(data.usertype);
            await loginpage.termsandconditions();
            await loginpage.usertypeasadmin();
            await loginpage.clickLogin();
            const dashboardPage = new DashBoard(page);
            await dashboardPage.saveProductNamesToFile('data/dashboardproductData.json');
            const productToAdd = dashboardData.products[0];
            await dashboardPage.addProductToCart(productToAdd);
            await dashboardPage.clickcheckout();
            await expect(page.getByText("iphone X")).toBeVisible();
            await page.getByRole('button', { name: 'Checkout' }).click();
            await page.locator("#country").pressSequentially("india", { delay: 150 });         
            await page.locator('.suggestions').getByText("India").click();
            await page.getByText('I agree with the term &').click();
            await page.getByRole('button', { name: 'Purchase' }).click();
            await expect(await page.getByText('× Success! Thank you! Your')).toBeVisible();

        });
    }

});