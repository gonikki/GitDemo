import { Page } from '@playwright/test';
import { LoginPageLocators } from '../constantes/locators';


export class LoginPage {

    constructor(private page: Page) { }

    async naviagteToLoginpage() {

        await this.page.goto('/loginpagePractise/');
    }

    async enterusername(username: string) {
        await this.page.fill(LoginPageLocators.usernameInput, username);
    }

    async enterpassword(password: string) {
        await this.page.fill(LoginPageLocators.passwordInput, password);
    }

    async termsandconditions() {
        await this.page.click(LoginPageLocators.termsandconditionscheckbox);
    }

    async usertypeasadmin() {
        await this.page.click(LoginPageLocators.checkboxforadmin);

    }

    async usertypeasuser() {
        await this.page.click(LoginPageLocators.checkboxforuser);

    }

    async clickLogin() {
        await this.page.click(LoginPageLocators.loginButton);
    }
    async getErrorMessage(): Promise<string | null> {
        return await this.page.textContent(LoginPageLocators.errormessage); 
    }

  async selectUserType(usertype: string) {
  await this.page.selectOption(LoginPageLocators.usertype, { label: usertype });
}





}