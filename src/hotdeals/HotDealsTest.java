package hotdeals;

import baseSetup.BaseSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Create the package hotdeals
 * Create the class HotDealsTest
 */

public class HotDealsTest extends BaseSetup {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void openbrowser() {
        open_Browser(baseUrl);

    }

    /**
     * 1 - verifySaleProductsArrangeAlphabetically()
     * 1.1 Mouse hover on the “Hot deals” link
     * 1.2 Mouse hover on the “Sale”  link and click
     * 1.3 Verify the text “Sale”
     * 1.4 Mouse hover on “Sort By” and select “Name A-Z”
     * 1.5 Verify that the product arrange alphabetically
     */
    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Sale","User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"),10);
        mouseclickToElement(By.linkText("Name A - Z"),10);
        verifyMessage(By.xpath("//span[contains(text(),'Name A - Z')]"),10,"Name A - Z","user is not no a Name A - Z");

    }
    /**
     * 2 - verifySaleProductsPriceArrangeLowToHigh()
     * 		2.1 Mouse hover on the “Hot deals” link
     * 		2.2 Mouse hover on the “Sale”  link and click
     * 		2.3 Verify the text “Sale”
     * 		2.4 Mouse hover on “Sort By” and select “Price Low-High”
     * 		2.5 Verify that the product’s price arrange Low to High
     */
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){

        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Sale","User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"),10);
        mouseclickToElement(By.linkText("Price Low - High"),10);
        verifyMessage(By.xpath("//span[contains(text(),'Price Low - High')]"),10,"Price Low - High","user is not no a Price Low - High");
    }
    /**
     * 3 - verifySaleProductsArrangeByRates()
     * 		3.1 Mouse hover on the “Hot deals” link
     * 		3.2 Mouse hover on the “Sale”  link and click
     * 		3.3 Verify the text “Sale”
     * 		3.4 Mouse hover on “Sort By” and select “Rates”
     * 		3.5 Verify that the product’s arrange Rates
     */
    @Test
    public void verifySaleProductsArrangeByRates(){
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Sale","User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"),20);
        mouseclickToElement(By.partialLinkText("Rates"),10);
        verifyMessage(By.xpath("//span[contains(text(),'Rates')]"),30,"Rates","user is not no a Rates ");

    }
    /**
     * 4 - verifyBestSellersProductsArrangeByZToA()
     * 		1.1 Mouse hover on the “Hot deals” link
     * 		1.2 Mouse hover on the “Bestsellers”  link and click
     * 		1.3 Verify the text “Bestsellers”
     * 		1.4 Mouse hover on “Sort By” and select “Name Z-A”
     * 		1.5 Verify that the product arrange by Z to A
     */
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Sale","User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"),10);
        mouseclickToElement(By.linkText("Name Z - A"),10);
        verifyMessage(By.xpath("//span[contains(text(),'Name Z - A')]"),10,"Name Z - A","user is not no a Name Z - A");

    }
    /**
     * verifyBestSellersProductsPriceArrangeHighToLow()
     * 		2.1 Mouse hover on the “Hot deals” link
     * 		2.2 Mouse hover on the “Bestsellers” link and click
     * 		2.3 Verify the text “Bestsellers”
     * 		2.4 Mouse hover on “Sort By” and select “Price High-Low”
     * 		2.5 Verify that the product’s price arrange High to Low
     */
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Sale","User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"),10);
        mouseclickToElement(By.linkText("Price High - Low"),10);
        verifyMessage(By.xpath("//span[contains(text(),'Price High - Low')]"),10,"Price High - Low","user is not no a Price High - Low");

    }
    /**
     * 6 - verifySaleProductArrangeByRates()
     * 		3.1 Mouse hover on the “Hot deals” link
     * 		3.2 Mouse hover on the “Sale”  link and click
     * 		3.3 Verify the text “Sale”
     * 		3.4 Mouse hover on “Sort By” and select “Rates”
     * 		3.5 Verify that the product’s arrange Rates
     */
    @Test
    public void verifySaleProductArrangeByRates(){
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"), 10);
        mouseclickToElement(By.xpath("//a[text()='Sale']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"),10,"Sale","User is not on Sale page");
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"),20);
        mouseclickToElement(By.partialLinkText("Rates"),10);
        verifyMessage(By.xpath("//span[contains(text(),'Rates')]"),30,"Rates","user is not no a Rates");

    }

    @After
    public void close_Browser() {
        super.close_Browser();
    }
}
