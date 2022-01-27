package browser.appiumTests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import util.driver.DriverHolder;


@Epic("Youtube")
@Feature("Home Page")
public class HomeTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void homeBeforeMethod() {
        homePage = PageFactory.initElements(DriverHolder.getDriver(), HomePage.class);
    }

    @Test(description = "Verify that user can click search on homepage")
    @Description("Verify that user can click search on homepage")
    @Story("As a user I should be able to click search on homepage")
    public void searchHomePage() throws InterruptedException {
        homePage.clickSearch();
        Thread.sleep(5000);
    }
}
