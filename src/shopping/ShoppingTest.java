package shopping;

import baseSetup.BaseSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/**
 * Create the package shopping
 * Create the class ShoppingTest
 * 1 - verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker()
 * 1.1 Mouse hover on the “Hot deals” link
 * 1.2 Mouse hover on the “Sale”  link and click
 * 1.3 Verify the text “Sale”
 * 1.4 Mouse hover on “Sort By” and select “Name A-Z”
 * 1.5 Click on “Add to cart” button of the product “Cup of Mojo Bluetooth
 * Speaker”
 * 1.6 Verify the message “Product has been added to your cart” display in  green bar
 * 1.7 Click on X sign to close the message
 * 1.8 Click on “Your cart” icon and Click on “View cart” button
 * 1.9 Verify the text “Your shopping cart - 1 item”
 * 1.10 Change the Qty = 2
 * 1.11 Verify the text “Your shopping cart - 2 items”
 * 1.12 Verify the Subtotal $39.98
 * 1.13 Verify the total $46.18
 * 1.14 Click on “Go to checkout” button
 * 1.15 Verify the text “Log in to your account”
 * 1.16 Enter Email address
 * 1.17 Click on “Continue” Button
 * 1.18 Verify the text “Secure Checkout”
 * 1.19 Fill all the mandatory fields
 * 1.20 Check the check box “Create an account for later use”
 * 1.21 Enter the password
 * 1.22 Select the Delivery Method to “Local Shipping”
 * 1.23 Select Payment Method “COD”
 * 1.24 Verify the total $47.22
 * 1.25 Click on “Place Order” Button
 * 1.26 Verify the text “Thank you for your order”
 */

public class ShoppingTest extends BaseSetup {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void openbrowser() {
        open_Browser(baseUrl);

    }

    @Test
    // create a method verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetooth Speaker()
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Sale", "User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"), 10);
        mouseclickToElement(By.linkText("Name A - Z"), 10);
        verifyMessage(By.xpath("//span[contains(text(),'Name A - Z')]"), 20, "Name A - Z", "user is not no a Name A - Z");
        Thread.sleep(100);
        mouseHoverToElement(By.xpath("//a[text()='Cup of Mojo Bluetooth Speaker']"), 10);
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-31']"), 20);
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"), 10);
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Your shopping cart - 1 item", "shopping cart is empty");
        driver.findElement(By.cssSelector("#amount31")).clear();
        sendTextFromElement(By.cssSelector("#amount31"), 10, "2");
        Thread.sleep(5000);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 50, "Your shopping cart - 2 items", "shopping cart is empty");
        Thread.sleep(5000);
        verifyMessage(By.xpath("//li[@class='subtotal']"), 30, "Subtotal: $39.98", "cart empty");
        verifyMessage(By.xpath("//li[@class='total']"), 30, "$46.18", "cart empty");
        clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"), 10);
        verifyMessage(By.xpath("//h3[contains(text(),'Log in to your account')]"), 10, "Log in to your account", "user is not on a login page");

        sendTextFromElement(By.xpath("//input[@id='email']"), 10, "xyzzz@gmail.com");
        clickOnElement(By.xpath("//tbody/tr[2]/td[1]/button[1]"), 10);
        verifyMessage(By.xpath("//h1[@class='title']"), 10, "Secure Checkout", "user is no on a  Secure Checkout page");
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-firstname']"), 10, "abced");
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-lastname']"), 10, "abced");
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-street']"), 10, "abced");
        driver.findElement(By.xpath("//input[@id='shippingaddress-city']")).clear();
        Thread.sleep(5000);
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-city']"), 10, "London");
        selectByValueFromDropdown(By.xpath("//select[@id='shippingaddress-country-code']"), 10, "GB");
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-custom-state']"), 10, "Wembley");
        driver.findElement(By.xpath("//input[@id='shippingaddress-zipcode']")).clear();
        Thread.sleep(5000);
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-zipcode']"), 10, "123456");
        sendTextFromElement(By.xpath("//input[@id='shippingaddress-phone']"), 10, "079012345611");
        clickOnElement(By.xpath("//input[@id='create_profile']"), 10);
        sendTextFromElement(By.xpath("//input[@id='password']"), 10, "123abc");
        Thread.sleep(5000);
        mouseclickToElement(By.cssSelector("#method128"), 20);
        Thread.sleep(5000);
        mouseclickToElement(By.cssSelector("#pmethod6"), 20);
        verifyMessage(By.xpath("//div[@class='total clearfix']/span[2]"), 10, "$47.22", "Wrong Amount");
        clickOnElement(By.xpath("//span[contains(text(),'Place order: $47.22')]"), 10);
        Thread.sleep(100);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Thank you for your order", "Order is not successfully");


    }

    /**
     * - verifyThatUserShouldClearShoppingCartSuccessfully()
     * 1.1 Mouse hover on the “Hot deals” link
     * 1.2 Mouse hover on the “Bestseller”  link and click
     * 1.3 Verify the text “Bestsellers”
     * 1.4 Mouse hover on “Sort By” and select “Name A-Z”
     * 1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
     * 1.6 Verify the message “Product has been added to your cart” display in  green bar
     * 1.7 Click on X sign to close the message
     * 1.8 Click on “Your cart” icon and Click on “View cart” button
     * 1.9 Verify the text “Your shopping cart - 1 item”
     * 1.10 Click on “Empty your cart” link
     * 1.11 Verify the text “Are you sure you want to clear your cart?” on alert
     * 1.12 Click “Ok” on alert
     * 1.13 Verify the message “Item(s) deleted from your cart”
     * 1.15 Verify the text “Your cart is empty”
     *
     */
    @Test
    public void  verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.linkText("Bestsellers"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Bestsellers", "User is not on Bestsellers");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sales ')]"), 10);
        mouseclickToElement(By.linkText("Name A - Z"), 10);
        verifyMessage(By.xpath("//span[contains(text(),'Name A - Z')]"), 20, "Name A - Z", "user is not no a Name A - Z");
        mouseHoverToElement(By.xpath("//a[text()='Vinyl Idolz: Ghostbusters']"));
        mouseclickToElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"),10);
        Thread.sleep(500);
        mouseclickToElement(By.xpath("//div[@id='status-messages']/a"),10);
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"), 10);
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Your shopping cart - 1 item", "shopping cart is empty");
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
        verifyMessage(By.xpath("//li[@class='info']"),10, "Item(s) deleted from your cart","Item(s) not deleted from your cart");
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Your cart is empty","Your cart is not empty");






    }

    /*@After
    public void close_Browser() {
        super.close_Browser();
    }*/
}
