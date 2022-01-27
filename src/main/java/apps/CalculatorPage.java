package apps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalculatorPage {

    public static WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "android.widget.Button")
    List<WebElement> number;

    @FindBy( id= "com.google.android.calculator:id/op_add")
     WebElement add;

    @FindBy (id = "com.google.android.calculator:id/result_preview")
    WebElement result;


    public int add(int a, int b) throws InterruptedException {
        clickNumber(a);
        add.click();
        clickNumber(b);
        return Integer.parseInt(result.getText().trim());
    }

    private void clickNumber(int value){
        int length = number.size();

        for (int i=0; i<length; i++){
            if("0123456789".contains(number.get(i).getText()) && Integer.parseInt(number.get(i).getText()) == value){
                number.get(i).click();
            }
            else {
                new AssertionError("unable to find given number");
            }
        }
    }

}
