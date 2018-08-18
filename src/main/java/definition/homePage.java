package definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class homePage {
	
	WebDriver driver;
	
	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul Gulati\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.swym.it/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@When("^Alki's boutique header is available$")
	public void alki_s_boutique_header_is_available() {
		driver.findElement(By.xpath("//a[@class='site-header__logo-link']")).isDisplayed();
		
	}

	@Then("^verify the Alki image is available$")
	public void verify_the_Alki_image_is_available() {
		////div[@class='hero__inner']
		driver.findElement(By.xpath("//div[@class='hero__inner']")).isDisplayed();	
		
	}

	@Then("^verify search button is clickable$")
	public void verify_search_button_is_clickable() {
		
		////button[@type='button']//*[@class='icon icon-search']
		driver.findElement(By.xpath("//button[@type='button']//*[@class='icon icon-search']")).isEnabled();
		driver.close();
	}
	
	

}
