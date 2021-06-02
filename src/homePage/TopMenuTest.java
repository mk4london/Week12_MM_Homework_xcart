package homePage;

import baseSetup.BaseSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/*Create package homepage
*Create class TopMenuTest
*/
public class TopMenuTest extends BaseSetup {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void openbrowser() {
        open_Browser(baseUrl);

    }
    /**
    *1 - verifyUserShouldNavigateToShippingPageSuccessfully()
	*	1.1 Click on the “Shipping” link
	*	1.2 Verify the text “Shipping”
     */

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        mouseclickToElement(By.xpath("//a[text()='Shipping']"), 05);
        verifyMessage(By.id("page-title"), 10, "Shipping", "user is not on Shipping page");

    }
    /**
    *2 - verifyUserShouldNavigateToNewPageSuccessfully()
	*	2.1 Click on the “New!” link
	*	2.2 Verify the text “New arrivals”
     */

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        mouseclickToElement(By.xpath("//a[text()='New!']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "New arrivals", "user is not on New arrivals page");
    }
    /**
    *3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
	*	3.1 Click on the “Coming soon” link
	*	3.2 Verify the text “Coming soon”
    */

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        mouseclickToElement(By.xpath("//a[text()='Coming soon']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Coming soon", "user is not on Coming soon page");

    }

    /**
     * 4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
     * 		4.1 Click on the “Contact us” link
     * 		4.2 Verify the text “Contact us”
     */


    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        mouseclickToElement(By.xpath("//a[text()='Contact us']"), 10);
        verifyMessage(By.xpath("//h1[@id='page-title']"), 10, "Contact us", "usesr is not on a Contact us page");
    }

    @After
    public void close_Browser() {
        super.close_Browser();
    }
}
