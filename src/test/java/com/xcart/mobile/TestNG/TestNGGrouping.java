package com.xcart.mobile.TestNG;

import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test(groups = {"regression","sanity"})
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        System.out.println("Shipping Page Successfully");
    }
    @Test(groups = {"regression","sanity"})
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        System.out.println("New Page Successfully");
    }
    @Test(groups = {"regression","sanity"})
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        System.out.println("Comming Soon");
    }
    @Test(groups = {"regression","sanity"})
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        System.out.println("Contact Us");
    }
    @Test(groups = {"regression","smoke"})
    public void verifySaleProductsArrangeAlphabetically(){
        System.out.println("Arrange Alphabetically");
    }
    @Test(groups = {"regression","smoke"})
    public void verifySaleProductsPriceArrangeLowToHigh(){
        System.out.println("Price Arrange Low To High");
    }
    @Test(groups = {"regression","smoke"})
    public void verifySaleProductsArrangeByRates(){
        System.out.println("Products Arrange By Rates");
    }
    @Test(groups = {"regression","smoke"})
    public void verifyBestSellersProductsArrangeByZToA(){
        System.out.println("Product Arrange Z to A");
    }

    @Test(groups = {"regression","smoke","sanity"})
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
        System.out.println("Product High To Low");
    }
    @Test(groups = {"regression","smoke","sanity"})
    public void verifyBestSellersProductsArrangeByRates(){
        System.out.println("Arrange By Rates");
    }

    @Test(groups = {"regression","smoke","sanity"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker(){
        System.out.println("Bluetooth Speaker");
    }
    @Test(groups = {"regression","smoke","sanity"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully(){
        System.out.println("Clear Shopping Cart");
    }
}
