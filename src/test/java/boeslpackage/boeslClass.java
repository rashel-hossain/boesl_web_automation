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

        Thread.sleep(2000);
        // navigate to back page //driver.navigate().back();
        // navigate to refresh or reload page //driver.navigate().refresh();
        //navigate to forward page //driver.navigate().forward();
        // navigate to specific //driver.navigate().to("https://boesl.softbd.xyz/profile");

        // check website title
        String ExpectedTitle= "BOESL - Profile";
        String ActualTitle= driver.getTitle();
        if(ActualTitle.equals(ExpectedTitle)){
            System.out.println("Title match");
        }
        else {
            System.out.println("Title doesn't match!");
        }

        // Check website url
        String ExpectedURL= "https://boesl.softbd.xyz/profile";
        String ActualURL= driver.getCurrentUrl();
        if(ActualURL.equals(ExpectedURL)){
            System.out.println("URL Matched");
        }
        else {
            System.out.println("URL doesn't matched!");
        }

    }
}
