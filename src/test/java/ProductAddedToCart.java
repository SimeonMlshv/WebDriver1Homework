import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductAddedToCart {

    @Test
    public void productAddedToCart_when_addToCart(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce" + Keys.ENTER);

        WebElement firstItemAdd = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
        firstItemAdd.click();

        WebElement secondItemAdd = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
        secondItemAdd.click();

        WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));
        shoppingCart.click();

        var firstItemInBasket = driver.findElement(By.id("item_4_title_link"));
        Assertions.assertEquals("Sauce Labs Backpack", firstItemInBasket.getText());

        var secondItemInBasket = driver.findElement(By.id("item_0_title_link"));
        Assertions.assertEquals("Sauce Labs Bike Light", secondItemInBasket.getText());

        driver.close();
    }
}
