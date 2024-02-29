package com.test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.net.MalformedURLException;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(accessibility = "email")
    @iOSFindBy(accessibility = "nome_da_accessibilidade1")
    public MobileElement emailField;
    @AndroidFindBy(accessibility = "password")
    @iOSFindBy(accessibility = "nome_da_accessibilidade2")
    public MobileElement passwordField;
    @AndroidFindBy(accessibility = "login-button")
    @iOSFindBy(accessibility = "nome_da_accessibilidade3")
    public MobileElement confirmEmailButton;

    public LoginScreen() throws MalformedURLException {
        super();
    }

    public void waitForSeconds(Integer seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    public void loginSuccessfully(String email, String psw) {
        try {
            waitForSeconds(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        emailField.sendKeys(email);
        passwordField.sendKeys(psw);

    }

    public void confirmEmailButton() {
        confirmEmailButton.click();
    }
}
