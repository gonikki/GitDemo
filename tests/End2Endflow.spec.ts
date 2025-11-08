import { test, expect } from '@playwright/test';

test.describe('test for all End2End flow', () => {

    test('Login the screen', async ({ page }) => {

        await page.goto('https://rahulshettyacademy.com/client/#/auth/login');
        await page.getByPlaceholder('email@example.com').fill("abc123@playwright.com");
        await page.locator("#userPassword").fill("Hi@123456");
        await page.locator("#login").click();
        await page.waitForLoadState('networkidle');
        await page.locator(".card-body b").first().waitFor();
        await page.locator(".card-body", { hasText: "ZARA COAT 3" }).getByRole("button", { name: " Add To Cart" }).click();
        await page.locator("[routerlink*='cart']").click();
        await page.waitForLoadState('networkidle');
        await expect(page.getByText("ZARA COAT 3")).toBeVisible();
        await page.getByRole("button", { name: "Checkout" }).click();
        await page.locator(".form__cc > div:nth-child(2) >div:nth-child(2)>input").fill("546");
        await page.locator(".form__cc > div:nth-child(3)>div:nth-child(1)>input").fill("Nikhil");
        await page.getByPlaceholder("Select Country").pressSequentially("ind");
        await page.getByRole("button", { name: "India" }).nth(1).click();
        await page.getByText("PLACE ORDER").click();
        await expect(page.getByText("Thankyou for the order.")).toBeVisible();
        const rawtext = await page.locator(".em-spacer-1 .ng-star-inserted").textContent();
        const orderid = rawtext?.replace(/\|/g, '').trim();
        console.log(orderid);
        await page.getByRole('button', { name: 'ORDERS' }).click();
        const rows = await page.locator("tbody tr th").allTextContents();
        console.log(rows);
        expect(rows).toContain(orderid);

        await page.locator('tr', { hasText: orderid }).getByRole('button', { name: 'View' }).click();
        const orderIdDetails = await page.locator(".col-text").textContent();
        expect(orderid).toContain(orderIdDetails);


    });






});

