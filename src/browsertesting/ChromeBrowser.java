package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        //  Setup Chrome browser
        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the url into browser
        driver.get(baseURL);
        // maximise the browser
        driver.manage().window().maximize();
        // we give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //  Enter the username to username field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //  Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Close the browser
        driver.close();


    }
}
