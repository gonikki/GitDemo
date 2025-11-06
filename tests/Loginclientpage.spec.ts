import { test, expect } from '@playwright/test';
import { resisterNewUser } from '../fixtures/registerUser';

test('Login with newly registered user 01', async ({ page }) => {
    const user = await resisterNewUser();

    await page.goto('https://rahulshettyacademy.com/client/#/auth/login');
    await page.fill('#userEmail', user.email);
    await page.fill('#userPassword', user.password);
    await page.locator("[value='Login']").click();
    await page.waitForLoadState('networkidle');
    await page.locator(".card-body b").first().waitFor();
});

test('Login with newly registered user 02', async ({ page }) => {
    const user = await resisterNewUser();

    await page.goto('https://rahulshettyacademy.com/client/#/auth/login');
    await page.fill('#userEmail', user.email);
    await page.fill('#userPassword', user.password);
    await page.locator("[value='Login']").click();
    await page.waitForLoadState('networkidle');
    await page.locator(".card-body b").first().waitFor();
});


test('Login with newly registered user 03', async ({ page }) => {
    const user = await resisterNewUser();

    await page.goto('https://rahulshettyacademy.com/client/#/auth/login');
    await page.fill('#userEmail', user.email);
    await page.fill('#userPassword', user.password);
    await page.locator("[value='Login']").click();
    await page.waitForLoadState('networkidle');
    await page.locator(".card-body b").first().waitFor();
});


