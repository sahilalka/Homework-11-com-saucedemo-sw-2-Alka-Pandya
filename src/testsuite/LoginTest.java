package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Enter “secret_sauce” password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //Verify the text “PRODUCTS”
        String expectedText = "Products";
        WebElement actualTextElement = driver.findElement(By.xpath("//span[text()='Products']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text not found", expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter “secret_sauce” password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //Verify that six products are displayed on page
        //1st product
        String expectedProduct1 = "Sauce Labs Backpack";
        WebElement actualProductElement1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        String actualProduct1 = actualProductElement1.getText();
        Assert.assertEquals("Product not found", expectedProduct1, actualProduct1);

        //2nd product
        String expectedProduct2 = "Sauce Labs Bike Light";
        WebElement actualProductElement2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        String actualProduct2 = actualProductElement2.getText();
        Assert.assertEquals("Product not found", expectedProduct2, actualProduct2);

        //3rd product
        String expectedProduct3 = "Sauce Labs Bolt T-Shirt";
        WebElement actualProductElement3 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String actualProduct3 = actualProductElement3.getText();
        Assert.assertEquals("Product not found", expectedProduct3, actualProduct3);

        //4th product
        String expectedProduct4 = "Sauce Labs Fleece Jacket";
        WebElement actualProductElement4 = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
        String actualProduct4 = actualProductElement4.getText();
        Assert.assertEquals("Product not found", expectedProduct4, actualProduct4);

        //5th product
        String expectedProduct5 = "Sauce Labs Onesie";
        WebElement actualProductElement5 = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
        String actualProduct5 = actualProductElement5.getText();
        Assert.assertEquals("Product not found", expectedProduct5, actualProduct5);

        //6th product
        String expectedProduct6 = "Test.allTheThings() T-Shirt (Red)";
        WebElement actualProductElement6 = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
        String actualProduct6 = actualProductElement6.getText();
        Assert.assertEquals("Product not found", expectedProduct6, actualProduct6);


    }

}











































