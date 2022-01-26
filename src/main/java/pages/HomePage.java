package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='icon-button topbar-menu-button-avatar-button']//c3-icon//*[name()='svg']")
    WebElement search;

    public void clickSearch(){
        search.click();
    }

}
