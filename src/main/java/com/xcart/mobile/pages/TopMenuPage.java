package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TopMenuPage extends Utility {

    By verifyShippingText = By.partialLinkText("Shipping");
    By verifyNewArrivalText = By.xpath("//h1[text()='New arrivals']");
    By verifyComingSoonText = By.xpath("//h1[@id='page-title']");
    By verifyContactUsText = By.xpath("//h1[@id='page-title']");


    public String verifyShippingText() {
        Reporter.log("Verify Shipping Text" + verifyShippingText.toString() + "<br>");
        return getTextFromElement(verifyShippingText);
    }

    public String verifyNewArrivalText() {
        Reporter.log("Verify NewArrival Text" + verifyNewArrivalText.toString() + "<br>");
        return getTextFromElement(verifyNewArrivalText);
    }
    public String verifyComingSoonText() {
        Reporter.log("Verify ComingSoon Text" + verifyComingSoonText.toString() + "<br>");
        return getTextFromElement(verifyComingSoonText);
    }
    public String verifyContactUsText() {
        Reporter.log("Verify ContactUs Text" + verifyContactUsText.toString() + "<br>");
        return getTextFromElement(verifyContactUsText);
    }
}