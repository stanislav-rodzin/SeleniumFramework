package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTest1 {

    String websiteURL = "https://test.my-fork.com/";
    public ChromeDriver driver;
    public String emailTxtField = "//input[@id='email']";
    public String passTxtField = "//input[@id='password']";
    public String signIn_Btn = "//a[@class='menu-item log-in-button']";
    public String Submit_Btn = "//button[@class='auth-page-main-block-form-submit-button']";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\SeleniumFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }

    public void takeMeSignInPage() throws InterruptedException{
        driver.get(websiteURL);
        driver.findElement(By.xpath(signIn_Btn)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(emailTxtField)).sendKeys("Stanislav@sdd.ut");
        driver.findElement(By.xpath(passTxtField)).sendKeys("password123");
        driver.findElement(By.xpath(Submit_Btn)).click();
    }

        @Test
        public void startDriver() {
            driver.get(websiteURL);
        }

        @Test
        public void openWebsite() {
            driver.get(websiteURL);
        }

        @Test
        public void openSignInPage() {
            driver.get(websiteURL);
            driver.findElement(By.xpath(signIn_Btn)).click();
        }

        @Test
        public void EmailPasswordFieldsLoginbuttonValidate() throws InterruptedException {
            driver.get(websiteURL);
            driver.findElement(By.xpath(signIn_Btn)).click();
            Thread.sleep(1000);
            System.out.println(driver.findElement(By.xpath(emailTxtField)).isDisplayed());
            System.out.println(driver.findElement(By.xpath(passTxtField)).isDisplayed());
            System.out.println(driver.findElement(By.xpath(Submit_Btn)).isDisplayed());
        }

        @Test
        public void InvalidEmailPasswordAndClickLoginButton()  throws InterruptedException{
            takeMeSignInPage();
        }

        @Test
        public void FillInvalidEmailAndPasswordAndValidateError() throws InterruptedException {
            takeMeSignInPage();
            Thread.sleep(3000);
            System.out.println(driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());
        }

        @Test
        public void ValidateRememberMeCheckbox() throws InterruptedException {
            driver.get(websiteURL);
            driver.findElement(By.xpath(signIn_Btn)).click();
            Thread.sleep(1000);
            System.out.println(driver.findElement(By.id("auth-page-remember-me")).isSelected());
        }
    }

