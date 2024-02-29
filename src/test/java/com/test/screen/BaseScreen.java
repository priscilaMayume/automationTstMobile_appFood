package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class BaseScreen {
    public BaseScreen() throws MalformedURLException {
        if (Hooks.getDriver() == null) {
            Hooks.checkDriver();
        }
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), this);
    }
}
