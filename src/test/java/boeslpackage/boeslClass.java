package boeslpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class boeslClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Website declaration
        driver.get("https://boesl.softbd.xyz/login");
        driver.manage().window().maximize();

        // login user and password
        driver.findElement(By.name("phone_number")).sendKeys("01722354001");
        Thread.sleep(2000); // after 3s por password input filed bosbe
        driver.findElement(By.name("password")).sendKeys("Test@2024");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]")).click();
// first comment
        // 2nd
        // 3rd
    }
}
