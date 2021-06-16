package com.xcart.mobile.pages;

import com.sun.javafx.image.impl.ByteRgba;
import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class HotDealsPage extends Utility {


    By mouseHoverOnHotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By mouseHoverOnSaleAndClick = By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]");
    By verifySaleText = By.xpath("//h1[text()='Sale']");
    By moseHoverOnSortBy = By.xpath("//span[@class='sort-by-value']");
    By clickOnAlphabeticaly = By.partialLinkText("Name A -");
    By verifyProductArrangeAlphabeticaly = By.xpath("//h5[@class='product-name']/a[1]");

    By clickOnPriceLowToHigh = By.partialLinkText("Price Low - Hi");
    By verifyProductArrangePriceLowToHigh = By.xpath("//span[@class='price product-price']");
    By clickOnRates = By.partialLinkText("Rates");
    By verifyProductArrangeRates = By.xpath("//div[@class='rating']");

    By mouseHoverOnBestSellersAndClick = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']");
    By verifyBestsellersText = By.xpath("//h1[text()='Bestsellers']");
    By moseHoverOnBestsellerSortby = By.xpath("//span[@class='sort-by-value']");
    By clickOnZtoA = By.partialLinkText("Name Z -");
    By verifyProductArrangeZtoA = By.xpath("//h5[@class='product-name']/a[1]");

    By mouseHoverOnSortBy = By.xpath("//span[@class='sort-by-value']");
    By clickOnHighToLow = By.partialLinkText("Price High - Low");
    By verifyProductHighToLow = By.partialLinkText("Price High - Low");


    By clickOnBestsellersRates = By.xpath("//span[@class='sort-by-value']");
    By verifyBestsellersRates = By.partialLinkText("Rates");


    //1.1 Mouse hover on the “Hot deals” link
    public void mouseHoverOnHotDeals() {
        Reporter.log("Mouse Hoover on Hot Deals" + mouseHoverOnHotDeals.toString() + "<br>");
        mouseHover(mouseHoverOnHotDeals);
    }

    //1.2 Mouse hover on the “Sale”  link and click
    public void mouseHoverOnSaleAndClick() {
        Reporter.log("Mouse Hoover on Sale and Click" + mouseHoverOnSaleAndClick.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverOnSaleAndClick);
    }

    //1.3 Verify the text “Sale”
    public String verifySaleText() {
        Reporter.log("Verify Sale Text" + verifySaleText.toString() + "<br>");
        return getTextFromElement(verifySaleText);
    }

    //   1.4 Mouse hover on “Sort By” and select “Name A-Z”
    public void moseHoverOnSortBy() {
        Reporter.log("Mouse Hoover on Sort By" + moseHoverOnSortBy.toString() + "<br>");
        clickOnElement(moseHoverOnSortBy);
    }


    public void clickOnAlphabeticalyOrder(String name) {
        Reporter.log("Click On Alphabetical" + clickOnAlphabeticaly.toString() + "<br>");
        clickOnElement(clickOnAlphabeticaly);
    }

    // 1.5 Verify that the product arrange alphabetically
    public List getlistOfproducts() {
        Reporter.log("Get List of Product to Arrange in Aplhabeticaly" + verifyProductArrangeAlphabeticaly.toString() + "<br>");
        return getListfromwebelements(verifyProductArrangeAlphabeticaly);
    }

    //2.5 Verify that the product’s price arrange Low to High
    public void clickOnLowToHigh(String price) {
        Reporter.log("Click On Low to High" + clickOnPriceLowToHigh.toString() + "<br>");
        clickOnElement(clickOnPriceLowToHigh);
    }

    public List verifyProductPriceLowToHigh() {
        Reporter.log("Click On Low to High" + verifyProductArrangePriceLowToHigh.toString() + "<br>");
        return getListfromwebelements(verifyProductArrangePriceLowToHigh);
    }

    //3.4 Mouse hover on “Sort By” and select “Rates”
    public void clickRates() {
        Reporter.log("Click On Rates" + clickOnRates.toString() + "<br>");
        clickOnElement(clickOnRates);
    }

    //3.5 Verify that the product’s arrange Rates
    public List verifyProductRates() {
        Reporter.log("Click On Low to High" + verifyProductArrangeRates.toString() + "<br>");
        return getListfromwebelements(verifyProductArrangeRates);
    }

    //1.2 Mouse hover on the “Bestsellers”  link and click
    public void mouseHoverOnBestsellers() {
        Reporter.log("Mouse Hoover on Bestsellers and Click" + mouseHoverOnBestSellersAndClick.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverOnBestSellersAndClick);
    }

    //1.3 Verify the text “Bestsellers”
    public String verifyBestsellers() {
        Reporter.log("Verify Bestsellers Text" + verifyBestsellersText.toString() + "<br>");
        return getTextFromElement(verifyBestsellersText);
    }

    // 1.4 Mouse hover on “Sort By” and select “Name Z-A”
    public void moseHoverOnZtoA() {
        Reporter.log("Mouse Hoover on Sort By" + moseHoverOnBestsellerSortby.toString() + "<br>");
        clickOnElement(moseHoverOnBestsellerSortby);
    }

    public void clickOnZtoA(String name) {
        Reporter.log("Click On ZtoA" + clickOnZtoA.toString() + "<br>");
        clickOnElement(clickOnZtoA);
    }

    //1.5Verify that the product arrange by Z to A
    public List getlistOfproductZtoA() {
        Reporter.log("Get List of Product to Arrange in ZtoA" + verifyProductArrangeZtoA.toString() + "<br>");
        return getListfromwebelements(verifyProductArrangeZtoA);
    }

    //2.4 Mouse hover on “Sort By” and select “Price High-Low”
    public void moseHoverOnSort() {
        Reporter.log("Mouse Hoover on Sort By" + moseHoverOnSortBy.toString() + "<br>");
        clickOnElement(moseHoverOnSortBy);
    }

    public void clickHighToLow(String name) {
        Reporter.log("Click On ZtoA" + clickOnHighToLow.toString() + "<br>");
        clickOnElement(clickOnHighToLow);
    }
    //	2.5 Verify that the product’s price arrange High to Low

    public List productHighToLow() {
        Reporter.log("Get List of Product to Arrange in ZtoA" + verifyProductHighToLow.toString() + "<br>");
        return getListfromwebelements(verifyProductHighToLow);
    }

 //3.4 Mouse hover on “Sort By” and select “Rates”
    public void sortAndclickRates() {
        Reporter.log("Click On Rates" + clickOnBestsellersRates.toString() + "<br>");
        clickOnElement(clickOnBestsellersRates);
    }

    //3.5 Verify that the product’s arrange Rates
    public List verifyProductRates1() {
        Reporter.log("Click On Low to High" + verifyBestsellersRates.toString() + "<br>");
        return getListfromwebelements(verifyBestsellersRates);
    }



}
