package com.xcart.mobile.testsuits;

import com.xcart.mobile.pages.HomePage;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.TopMenuPage;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {

    HomePage homePage = new HomePage();
    TopMenuPage topMenuPage = new TopMenuPage();
    HotDealsPage hotDealsPage = new HotDealsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {

        homePage.clickOnShippingLink();
        String expectedmessage = "Shipping";
        String actualmessage = topMenuPage.verifyShippingText();
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {

        homePage.clickOnNewLink();
        String expectedMessage1 = "New arrivals";
        String actualMessage1 = topMenuPage.verifyNewArrivalText();
        Assert.assertEquals(expectedMessage1, actualMessage1);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException {

        homePage.clickOnComingSoonLink();
        String expectedMessage2 = "Coming soon";
        String actualMessage2 = topMenuPage.verifyComingSoonText();
        Assert.assertEquals(expectedMessage2, actualMessage2);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {

        homePage.clickOnContactUsLink();
        String expectedMessage3 = "Contact us";
        String actualMessage3 = topMenuPage.verifyContactUsText();
        Assert.assertEquals(expectedMessage3, actualMessage3);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        // Thread.sleep(1000);
        hotDealsPage.mouseHoverOnSaleAndClick();
        // Thread.sleep(1000);
        hotDealsPage.verifySaleText();
        // Thread.sleep(1000);
        hotDealsPage.moseHoverOnSortBy();
        //   Thread.sleep(1000);
        hotDealsPage.clickOnAlphabeticalyOrder("Name A-Z");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.getlistOfproducts();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);

        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();

        hotDealsPage.mouseHoverOnSaleAndClick();

        hotDealsPage.verifySaleText();
        //Thread.sleep(1000);
        hotDealsPage.moseHoverOnSortBy();
        // Thread.sleep(1000);
        hotDealsPage.clickOnLowToHigh("Price Low-High");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.verifyProductPriceLowToHigh();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);

        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        // Thread.sleep(1000);
        hotDealsPage.mouseHoverOnSaleAndClick();
        // Thread.sleep(1000);
        hotDealsPage.verifySaleText();
        // Thread.sleep(1000);
        hotDealsPage.moseHoverOnSortBy();
        //   Thread.sleep(1000);
        hotDealsPage.clickRates();
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.verifyProductRates();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);

        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        hotDealsPage.mouseHoverOnBestsellers();
        String expectedText = "Bestsellers";
        String actualText = hotDealsPage.verifyBestsellers();
        Assert.assertEquals(actualText, expectedText);
        hotDealsPage.moseHoverOnSortBy();
        hotDealsPage.clickOnZtoA("Name Z-A");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.getlistOfproductZtoA();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);

        Collections.sort(tempList,Collections.reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        hotDealsPage.mouseHoverOnHotDeals();
        // Thread.sleep(1000);
        hotDealsPage.mouseHoverOnBestsellers();
        // Thread.sleep(1000);
        String expectedText = "Bestsellers";
        String actualText = hotDealsPage.verifyBestsellers();
        Assert.assertEquals(actualText, expectedText);
        // Thread.sleep(1000);
        hotDealsPage.moseHoverOnSort();
        hotDealsPage.clickHighToLow("Price High - Low");
        List<WebElement> products;
        products = hotDealsPage.getlistOfproductZtoA();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);

        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        // Thread.sleep(1000);
        hotDealsPage.mouseHoverOnBestsellers();
        String expectedText = "Bestsellers";
        String actualText = hotDealsPage.verifyBestsellers();
        Assert.assertEquals(actualText, expectedText);
        // Thread.sleep(1000);

        hotDealsPage.moseHoverOnSortBy();
        //   Thread.sleep(1000);
        hotDealsPage.sortAndclickRates();
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.verifyProductRates1();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);

        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);
    }
}



