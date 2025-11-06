import { test, expect } from '@playwright/test';
import { LoginPageLocators } from '../constantes/locators';
import loginData from '../data/loginData.json';
import { LoginPage } from '../pages/LoginPage';

test.describe('Login Tests', () => {
    for (const data of loginData) {
        test(`Login test for ${data.testid}`, async ({ browser }) => {

            const context = await browser.newContext();
            const page = await context.newPage();

            const loginpage = new LoginPage(page);
            await loginpage.naviagteToLoginpage();
            await loginpage.enterusername(data.username);
            await loginpage.enterpassword(data.password);
            const [newpage] = await Promise.all([
                context.waitForEvent('page'),
                page.locator("[href*='documents-request']").click(),
           ])
            const text = await newpage.locator(".red").textContent();
            console.log(text);
            await loginpage.selectUserType(data.usertype);
            await loginpage.termsandconditions();
            await loginpage.usertypeasadmin();
            await loginpage.clickLogin();

            if (data.expected === 'success') {
                await expect(page.getByText("Shop Name")).toBeVisible({timeout: 30000});
            } else if (data.expected === 'Incorrect username/password.') {
                console.log(page.locator(LoginPageLocators.errormessage).textContent());
                await expect(page.locator(LoginPageLocators.errormessage)).toContainText("Incorrect");
            } else if (data.expected === 'Empty username/password.') {
                console.log(page.locator(LoginPageLocators.errormessage).textContent());
                await expect(page.locator(LoginPageLocators.errormessage)).toContainText("Empty");
            }



        });


    }



});