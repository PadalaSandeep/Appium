package app.appiumTests;

import apps.CalculatorPage;
import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.driver.DriverFactory;
import util.driver.DriverHolder;

import java.net.MalformedURLException;

import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;

public class CalculatorTest {

 private CalculatorPage calculatorPage;

 @BeforeMethod
 public void setup() throws MalformedURLException {
  setDriver(DriverFactory.createAndroidAppDriver("Calculator"));
  calculatorPage = PageFactory.initElements(DriverHolder.getDriver(), CalculatorPage.class);
 }

 @Test
 @Description("Calculator tests")
 public void calculatorAdd() throws InterruptedException {
  Assert.assertEquals(calculatorPage.add(5,6),11);
 }

 @AfterMethod()
 public void teardown(){
  getDriver().quit();
 }
}
