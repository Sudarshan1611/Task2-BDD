package Practice.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {
	WebDriver driver;
    
	@Given("User is on Amazon Home Page")
    public void userIsOnAmazonHomePage() {
        // Navigate to the Amazon home page
		System.out.println("hello");
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\SUDARSHAN GAIKWAD\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");  
        
    }

    @When("User navigates to Amazon Sign In Page")
    public void userNavigatesToAmazonSignInPage() {
        // Click on Sign In link to navigate to Sign In page
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();
    }

    @Then("User enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        // Enter username and password in the respective fields
    	WebElement Username = driver.findElement(By.xpath("//input[@id='ap_email']"));
        Username.sendKeys(username);
        
        WebElement continu = driver.findElement(By.xpath("//input[@id='continue']"));
        continu.click();
        
        WebElement passward = driver.findElement(By.xpath("//input[@id='ap_password']"));
        passward.sendKeys(password);
        
        
    }

    @And("Keeping case as {string}")
    public void keepingCase(String caseType) {
        // Assuming no specific action is needed to keep case as specified
    	 
    }

    @Then("User clicks on Sign In button")
    public void userClicksOnSignInButton() {
        // Click on Sign In button to proceed with login
    	WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signin.click();
    }

    @And("Message displayed Login Successfully")
    public void userShouldGetLoggedIn() {
        // Verify successful login, this could be done by asserting the presence of some element specific to the logged-in stateString expectedURL="https://www.saucedemo.com/inventory.html";
    	String expectedURL="https://www.amazon.com/?ref_=nav_ya_signin";
	    String actualURL=driver.getCurrentUrl();
	    System.out.println("Actual URL"+actualURL);
	    Assert.assertEquals(expectedURL,actualURL);
	    driver.quit();

	    
    }

    
   

    

}
