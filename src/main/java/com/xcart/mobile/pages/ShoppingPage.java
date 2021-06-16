package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShoppingPage extends Utility {

   By clickAddtoCartButton = By.xpath("//div[@class='product productid-16 ']//div[@class='add-to-cart-button']");
    By verifySaleText1 = By.xpath("//li[(text()='Product has been added to your cart')]");
    By clickOnX = By.xpath("//a[@class='close']");
    By clickOnYourCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    By clickOnViewButton = By.xpath("//span[contains(text(),'View cart')]");
    By verifyShoppingCartText = By.xpath("//h1[@id='page-title']");
    By changeQuantity = By.xpath("//input[@id='amount16']");
    By veriFyShoppingCartText1 = By.xpath("//h1[text()='Your shopping cart - 2 items']");
    By verifySubTotal = By.xpath("//ul[@class='sums']//li[@class='subtotal']");
    By verifyTotal = By.xpath("//li[@class='total']//span[@class='surcharge-cell']");
    By clickOnCheckOutButton = By.xpath("//button[@class='btn  regular-button regular-main-button checkout']");
    By verifyLoginAccountText = By.xpath("//h3[text()='Log in to your account']");
    By enterEmailAdd = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']");
    By verifySecureCheckOut = By.xpath("//h1[@class='title']");
    By enterName = By.xpath("//input[@id='shippingaddress-firstname']");
    By enterLastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By enterAddress = By.xpath("//input[@id='shippingaddress-street']");
    By enterCityName = By.xpath("//input[@id='shippingaddress-city']");
    By selectCountryName = By.xpath("//select[@id='shippingaddress-country-code']");
    By enterState = By.xpath("//input[@id='shippingaddress-custom-state']");
    By enterZip = By.xpath("//input[@id='shippingaddress-zipcode']");
    By selectProfileCheckBox = By.xpath("//input[@id='create_profile']");
    By enterPassword = By.xpath("//input[@id='password']");

    By clickOnLocalShipping = By.xpath("//input[@id='method128' and @name='methodId']");
    By clickOnCODPayment = By.xpath("//input[@id='pmethod6']");

    By verifyTotal$37 = By.xpath("//div[@class='total clearfix']//span[@class='surcharge']");
    By placeOrderBtn = By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']");
    By verifyThankYou = By.xpath("//h1[@id='page-title']");
//input[@id='method128' and @name='methodId']
//input[@id='method128' and @name='methodId']

//


//1.5 Click on “Add to cart” button of the product “Cup of Mojo BluetoothSpeaker”
    public void setClickAddtoCartButton() {
        Reporter.log("Add to cart" + clickAddtoCartButton.toString() + "<br>");
        clickOnElement(clickAddtoCartButton);
    }
//1.6 Verify the message “Product has been added to your cart” display in  green bar
public String verifySaleText1() {
    Reporter.log("Verify Product has been added to your cart" + verifySaleText1.toString() + "<br>");
    return getTextFromElement(verifySaleText1);
}
    public void clickOn() {
        Reporter.log("Your cart" + clickOnX.toString() + "<br>");
        clickOnElement(clickOnX);
    }
    public void setClickOnYourCart() {
        Reporter.log("View cart" + clickOnYourCart.toString() + "<br>");
        clickOnElement(clickOnYourCart);
    }

    public void setClickOnViewButton() {
        Reporter.log("View cart" + clickOnViewButton.toString() + "<br>");
        clickOnElement(clickOnViewButton);
    }

    public String verifyShoppingCartItemText() {
        Reporter.log("Your shopping cart - 1 item" + verifyShoppingCartText.toString() + "<br>");
        return getTextFromElement(verifyShoppingCartText);

    }
    public void setChangeQuantity(String qty) {
        Reporter.log("Change Qty" + changeQuantity.toString() + "<br>");
         clear(changeQuantity);
         sendTextToElement(changeQuantity, qty);
    }
    public String verify2ShoppingCartItem() {
        Reporter.log("Your shopping cart - 2 item" + veriFyShoppingCartText1.toString() + "<br>");
        return getTextFromElement(veriFyShoppingCartText1);
    }
    public String verifySubTotal() {
        Reporter.log("Verify Sub Total" + verifySubTotal.toString() + "<br>");
        return getTextFromElement(verifySubTotal);
    }

    public String verifyTotal() {
        Reporter.log("Verify Total" + verifyTotal.toString() + "<br>");
        return getTextFromElement(verifyTotal);
    }
    public void setClickOnCheckOutButton(){
        Reporter.log("Click Button" + clickOnCheckOutButton.toString() + "<br>");
        clickOnElement(clickOnCheckOutButton);
    }
    public String verifyLogInAccount(){
        Reporter.log("Log in Account" + verifyLoginAccountText.toString() + "<br>");
        return  getTextFromElement(verifyLoginAccountText);
    }
    public void setEnterEmailAddress(String email){
        Reporter.log(" Enter Email" + enterEmailAdd.toString() + "<br>");
        sendTextToElement(enterEmailAdd, email);
    }
    public void clickOnContinueButton(){
        Reporter.log(" Click on Continue" + continueButton.toString() + "<br>");
        clickOnElement(continueButton);
    }
    public String verifySecureChekOutText(){
        Reporter.log("Secure checkout Text" + verifySecureCheckOut.toString() + "<br>");
        return getTextFromElement(verifySecureCheckOut);
    }
    public void setEnterName(String name){
        Reporter.log("Enter Name" + enterName.toString() + "<br>");
        sendTextToElement(enterName, name);
    }
    public void setEnterLastName(String name){
        Reporter.log("Enter Last Name" + enterLastName.toString() + "<br>");
        sendTextToElement(enterLastName, name);
    }
    public void setEnterAddress(String name){
        Reporter.log("Enter Address" + enterAddress.toString() + "<br>");
        sendTextToElement(enterAddress, name);
    }
public void setEnterCityName(String name){
    Reporter.log("Enter City Name" + enterCityName.toString() + "<br>");
    clear(enterCityName);
        sendTextToElement(enterCityName, name);
}
public void setSelectCountryName(String name) {
    Reporter.log("Enter Country Name" + selectCountryName.toString() + "<br>");
    selectByValueFromDropDown(selectCountryName, name);
}
    public void setEnterState(String name) {
        Reporter.log("Enter State Name" + enterState.toString() + "<br>");
        sendTextToElement(enterState, name);
    }
    public void setEnterZip(String name) {
        Reporter.log("Enter Zip Name" + enterZip.toString() + "<br>");
        clear(enterZip);
        sendTextToElement(enterZip, name);
    }
    public void setSelectProfileBox() {
        Reporter.log("Enter Profile Check" + selectProfileCheckBox.toString() + "<br>");
        clickOnElement(selectProfileCheckBox);
    }
    public void setEnterPassword(String name){
        Reporter.log("Enter Password" + enterPassword.toString() + "<br>");
        sendTextToElement(enterPassword, name);
    }
    public void setClickOnLocalShipping() {
        Reporter.log("Click on Local Shipping" + clickOnLocalShipping.toString() + "<br>");
        mouseHoverToElementAndClick(clickOnLocalShipping);
    }
    public void setClickOnCODPayment() {
        Reporter.log("Click on CodPaymnet" + clickOnCODPayment.toString() + "<br>");
        clickOnElement(clickOnCODPayment);
    }
    public String verifyTotalAmount$37() {
        Reporter.log("Verify Total $37" + verifyTotal$37.toString() + "<br>");
        return getTextFromElement(verifyTotal$37);
    }
    public void setPlaceOrderBtn() {
        Reporter.log("Set Place Order Btn" + placeOrderBtn.toString() + "<br>");
        clickOnElement(placeOrderBtn);
    }
    public String verifyThankYou() {
        Reporter.log("Verify Thank You" + verifyThankYou.toString() + "<br>");
        return getTextFromElement(verifyThankYou);
    }






}

