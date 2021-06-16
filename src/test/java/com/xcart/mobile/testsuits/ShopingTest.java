package com.xcart.mobile.testsuits;

import com.xcart.mobile.pages.HomePage;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.ShoppingPage;
import com.xcart.mobile.pages.TopMenuPage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopingTest extends TestBase {

    HomePage homePage = new HomePage();
    TopMenuPage topMenuPage = new TopMenuPage();
    HotDealsPage hotDealsPage = new HotDealsPage();
    ShoppingPage shoppingPage = new ShoppingPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        hotDealsPage.mouseHoverOnSaleAndClick();
        String expectedText = "Sale";
        String actualText = hotDealsPage.verifySaleText();
        Assert.assertEquals(actualText, expectedText);
        hotDealsPage.moseHoverOnSortBy();
        hotDealsPage.clickOnAlphabeticalyOrder("AtoZ");
        Thread.sleep(1000);
        shoppingPage.setClickAddtoCartButton();

        String expectedMsg1 = "Product has been added to your cart";
        String actualMsg1 = shoppingPage.verifySaleText1();
        Assert.assertEquals(expectedMsg1, actualMsg1);
        Thread.sleep(1000);
        shoppingPage.clickOn();
        shoppingPage.setClickOnYourCart();
        shoppingPage.setClickOnViewButton();
        String expectedMsg2 = "Your shopping cart - 1 item";
        String actualMsg2 = shoppingPage.verifyShoppingCartItemText();
        Assert.assertEquals(expectedMsg2, actualMsg2);
        Thread.sleep(2000);
        shoppingPage.setChangeQuantity("2");
        String expectedMsg4 = "Your shopping cart - 2 items";
        String actualMsg4 = shoppingPage.verify2ShoppingCartItem();
        Assert.assertEquals(actualMsg4, expectedMsg4);
        Thread.sleep(1000);
        String expectedMsg5 = "Subtotal: $29.98";
        String actualMsg5 = shoppingPage.verifySubTotal();
        Assert.assertEquals(actualMsg5, expectedMsg5);
        Thread.sleep(1000);

        String expectedMsg6 = "$36.00";
        String actualMsg6 = shoppingPage.verifyTotal();
        Assert.assertEquals(actualMsg6, expectedMsg6);
        Thread.sleep(1000);
        shoppingPage.setClickOnCheckOutButton();
        String expectedMsg7 = "Log in to your account";
        String actualMsg7 = shoppingPage.verifyLogInAccount();
        Assert.assertEquals(actualMsg7, expectedMsg7);
        Thread.sleep(1000);
        shoppingPage.setEnterEmailAddress("vrajesh" + randomInt + "@yahoo.com");
        shoppingPage.clickOnContinueButton();
        shoppingPage.verifySecureChekOutText();
        Thread.sleep(1000);
        String expectedMsg8 = "Secure Checkout";
        String actualMsg8 = shoppingPage.verifySecureChekOutText();
        Assert.assertEquals(actualMsg8, expectedMsg8);
        Thread.sleep(1000);
        shoppingPage.setEnterName("vrajesh");
        shoppingPage.setEnterLastName("patel");
        shoppingPage.setEnterAddress("12 foxlees");
        shoppingPage.setEnterCityName("London");
        shoppingPage.setSelectCountryName("GB");
        shoppingPage.setEnterState("Middlesex");
        Thread.sleep(1000);
        shoppingPage.setEnterZip("Ha0 2pr");
        shoppingPage.setSelectProfileBox();
        //Thread.sleep(1000);
        shoppingPage.setEnterPassword("Abcd1234");
        Thread.sleep(1000);
        shoppingPage.setClickOnLocalShipping();
        shoppingPage.setClickOnCODPayment();
        Thread.sleep(1000);
        String expectedMsg9 = "$37.03";
        String actualMsg9 = shoppingPage.verifyTotalAmount$37();
        Assert.assertEquals(actualMsg9, expectedMsg9);
        Thread.sleep(1000);
        shoppingPage.setPlaceOrderBtn();
        Thread.sleep(1000);
        String expectedMsg10 = "Thank you for your order";
        String actualMsg10 = shoppingPage.verifyThankYou();
        Assert.assertEquals(actualMsg10, expectedMsg10);


    }
}
