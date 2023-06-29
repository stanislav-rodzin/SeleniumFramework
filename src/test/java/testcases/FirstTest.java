package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\SeleniumFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://facebook.com");
    }
}
