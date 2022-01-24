package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By menu = By.className("svg-inline icon-bars");

    public void clickMenu(){
        click(menu);
    }

}
