package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class productPage {
	
	WebDriver driver;
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	
	@Given("^user is already on products page$")
	public void user_is_already_on_products_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul Gulati\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://demo.swym.it/collections/antoni-alison/products/daisy-dress-grey");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	}
	
	////img[@id='FeaturedImage-product-template']

	@When("^product page is displayed$")
	public void product_page_is_displayed(){
		

		driver.findElement(By.xpath("//img[@id='FeaturedImage-product-template']")).isDisplayed();
	}

	@Then("^verify size option is clickable$")
	public void verify_size_option_is_clickable() {
		driver.findElement(By.xpath("//select[@id='SingleOptionSelector-0']")).isEnabled();    
	}

	@Then("^verify color dropdown is clickable$")
	public void verify_color_dropdown_is_clickable() {
		driver.findElement(By.xpath("//select[@id='SingleOptionSelector-1']")).isEnabled(); 
	}

	@Then("^verify add to wishlist button is enabled and add the product to the wishlist$")
	public void verify_add_to_cart_button_is_enabled() {
		driver.findElement(By.xpath("//span[@class='swym-wishlist-cta']")).isEnabled();
		driver.findElement(By.xpath("//span[@class='swym-wishlist-cta']")).click();
		
	}

	@Then("^user should be navigated to the wishlist page$")
	public void user_should_be_navigated_to_the_cart_page() {
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	}
	
	////img[@class='cart__image']
	
	@Then("^verify user is able to see the product in the cart$")
	public void verify_user_is_able_to_see_the_product_in_the_cart() {
		String text = driver.findElement(By.xpath("//span[@class='swym-wishlist-cta']")).getText();
		
		Assert.assertEquals("Added to Wishlist",text);	
	
	}
	
	@Then("^user should be able to see the product in the wishlist$")
	public void user_should_be_able_to_see_the_product_in_the_wishlist(){
		driver.findElement(By.xpath("//i[@class='icon icon-swym-wishlist']")).click();
		driver.findElement(By.xpath("//*[@id=\"swym-welcome-button\"]")).click();
	}

	@Then("^click on the email button$")
	public void click_on_the_email_button() {
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//i[@class='swym-icon swym-email-grey']")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//*[@id=\"swym-trigger-email-auth-deny\"]")).click();
	}

	@Then("^click on connect button and enter email address$")
	public void click_on_connect_button_and_enter_email_address() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='swym-connect-for-share-button']")).click();
		driver.findElement(By.xpath(" //input[@id='swym-email-auth-input']")).sendKeys("automate@mailinator.com");
		driver.findElement(By.xpath("//button[@id='swym-email-auth-button']")).click();
		
	}

	@Then("^user should be see email sent response message$")
	public void user_should_be_see_email_sent_response_message() throws Throwable {
		
		String success = driver.findElement(By.xpath("//span[@class='swym-success']")).getText();
		System.out.println(success);
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
