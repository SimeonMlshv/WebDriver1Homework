import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class completeOrder {

    @Test
    public void completeOrderAtCheckout(){
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

        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
        checkout.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Simeon");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Miloshov");
        WebElement postCode = driver.findElement(By.id("postal-code"));
        postCode.sendKeys("2600");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
        continueButton.click();

    }
}
