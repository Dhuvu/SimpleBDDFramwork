package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterStepDefinition {

    WebDriver driver;

    @Given("^User able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on Registration Link$")
    public void user_click_on_Registration_Link() {
       driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }

    @Then("^User on Registration page and  verify Registration page title$")
    public void user_on_Registration_page_and_verify_Registration_page_title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
    }

    @Then("^user select the Gender and enter Firstname and Lastname and DOB and emailId$")
    public void user_select_the_Gender_and_enter_Firstname_and_Lastname_and_DOB_and_emailId() {
       driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Dhruvisha");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("27");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("June");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1998");
        driver.findElement(By.id("Email")).sendKeys("Dhruvi98@gmail.com");
    }

    @Then("^user enter Company Name and Password and ConfirmPassword$")
    public void user_enter_Company_Name_and_Password_and_ConfirmPassword() {
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");
        driver.findElement(By.id("Password")).sendKeys("Dhruv987");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dhruv987");
    }

    @Then("^User click on RegisterButton$")
    public void user_click_on_RegisterButton() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^User is on Home page$")
    public void user_is_on_Home_page() {
    }

    @Then("^User close the browser$")
    public void user_close_the_browser() {
        driver.quit();
    }



}
