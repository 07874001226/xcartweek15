package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ClearShoppingCart extends Utility {

    By clickOnAtoZ = By.partialLinkText("Name A -");
    By mouseHoverClickOn = By.xpath("//div[@class='product productid-13 ']//div[@class='add-to-cart-button']");
    By clickOnEmptyCart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By deleteMessage = By.xpath("//li[text()='Item(s) deleted from your cart']");
    By clickOnClose = By.xpath("//a[@class='close']");
    By emptyCartMessage = By.xpath("//h1[text()='Your cart is empty']");

    public void setClickOnAtoZ() {
        Reporter.log("Clicking on AtoZ" + clickOnAtoZ.toString() + "<br>");
        clickOnElement(clickOnAtoZ);
    }

    public void setMouseHoverClickOn() {
        Reporter.log("Mouse Hover on Click" + mouseHoverClickOn.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverClickOn);
    }

    public void setClickOnEmptyCart() {
        Reporter.log("Clicking on Empty Cart" + clickOnEmptyCart.toString() + "<br>");
        clickOnElement(clickOnEmptyCart);

    }

    public String verifyAlertMessage() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void clickOnOkAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String verifySetDeleteMessage() {
        Reporter.log("Delete Message" + deleteMessage.toString() + "<br>");
        return getTextFromElement(deleteMessage);
    }

    public void setClickOnClose() {
        Reporter.log("Clicking on close" + clickOnClose.toString() + "<br>");
        clickOnElement(clickOnClose);
    }

    public String verifySetEmptyCartMessage() {
        Reporter.log("Empty Cart Message" + emptyCartMessage.toString() + "<br>");
        return  getTextFromElement(emptyCartMessage);
    }
}


