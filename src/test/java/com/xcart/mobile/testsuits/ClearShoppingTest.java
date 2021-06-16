package com.xcart.mobile.testsuits;

import com.xcart.mobile.pages.ClearShoppingCart;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.ShoppingPage;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClearShoppingTest extends TestBase {

    ClearShoppingCart clearShoppingCart = new ClearShoppingCart();
    HotDealsPage hotDealsPage = new HotDealsPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        Thread.sleep(1000);
        hotDealsPage.mouseHoverOnBestsellers();
        Thread.sleep(1000);
        String expectedMsg10 = "Bestsellers";
        String actualMsg10 = hotDealsPage.verifyBestsellers();
        Assert.assertEquals(actualMsg10, expectedMsg10);
        Thread.sleep(1000);
        hotDealsPage.moseHoverOnSortBy();
        clearShoppingCart.setClickOnAtoZ();
        Thread.sleep(1000);
        clearShoppingCart.setMouseHoverClickOn();
        String expectedMsg11 = "Product has been added to your cart";
        String expectedMsg1 = "Product has been added to your cart";
        String actualMsg1 = shoppingPage.verifySaleText1();
        Assert.assertEquals(expectedMsg1, actualMsg1);
        Thread.sleep(1000);
        shoppingPage.clickOn();
        shoppingPage.setClickOnYourCart();
        shoppingPage.setClickOnViewButton();
        Thread.sleep(1000);
        String expectedMsg2 = "Your shopping cart - 1 item";
        String actualMsg2 = shoppingPage.verifyShoppingCartItemText();
        Assert.assertEquals(expectedMsg2, actualMsg2);
        clearShoppingCart.setClickOnEmptyCart();
        Thread.sleep(1000);
        String expectedPopUpMessage = "Are you sure you want to clear your cart?";
        String actualMessage = clearShoppingCart.verifyAlertMessage();
        Assert.assertEquals(actualMessage, expectedPopUpMessage);
        clearShoppingCart.clickOnOkAlert();
        Thread.sleep(1000);
        String expectedMsg13 = "Item(s) deleted from your cart";
        String actualMsg13 = clearShoppingCart.verifySetDeleteMessage();
        Assert.assertEquals(actualMsg13, expectedMsg13);
        Thread.sleep(1000);
        clearShoppingCart.setClickOnClose();
        String expectedMsg14 = "Your cart is empty";
        String actualMsg14 = clearShoppingCart.verifySetEmptyCartMessage();
        Assert.assertEquals(actualMsg14, expectedMsg14);




    }
}
