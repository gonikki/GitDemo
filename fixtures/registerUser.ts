import { request,expect } from "@playwright/test";
import { generateRandomUser } from '../utils/generateUser';

export async function resisterNewUser() {

    const user = generateRandomUser();
    const context = await request.newContext();
    const response = await context.post('https://rahulshettyacademy.com/api/ecom/auth/register',{
        data : {"firstName":user.username ,"lastName":"Test",
            "userEmail": user.email,"userRole":"customer",
            "occupation":"Doctor","gender":"Male","userMobile":"1234567890",
            "userPassword":"Test@1234","confirmPassword":"Test@1234","required":true}
    });

    expect(response.ok()).toBeTruthy();
    return user;
    
}