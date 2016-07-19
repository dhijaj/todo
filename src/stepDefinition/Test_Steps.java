package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.junit.Assert;

public class Test_Steps {
	FirefoxDriver driver = new FirefoxDriver();
	private static Logger Log = Logger.getLogger(Test_Steps.class.getName());
	 
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		DOMConfigurator.configure("log4j.xml");
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://gcloud-todos.appspot.com/examples/angularjs/#/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "AngularJS • TodoMVC";
        Assert.assertEquals(actualTitle, expectedTitle);
        Log.info("New test page is not launched");
        
	}

	@When("^User Navigate to create Todo$")
	public void user_Navigate_to_create_Todo()  {
		driver.findElement(By.xpath("html/body/ng-view/section/header/form/input")).click();
		 Log.info("User Navigate to create Todo");
	}

	@When("^User enters sample text$")
	public void user_enters_sample_text()  {
		driver.findElement(By.id("new-todo")).sendKeys("Sample todo "); 
	  
	}

	@Then("^User press enter in keyboard to save$")
	public void user_press_enter_in_keyboard_to_save()  {
		driver.findElement(By.id("new-todo")).sendKeys(Keys.ENTER);
		Log.info("User press enter in keyboard to save");
	}
	

	@Then("^User selects the first todo item to make it complete$")
	public void user_selects_the_first_todo_item_to_make_it_complete()  {
		driver.findElement(By.xpath("html/body/ng-view/section/section/ul/li[1]/div/input")).click();
		Log.info("User selects the first todo item to make it complete");
	}
	
	@Then("^User selects the first todo item to delete it$")
	public void user_selects_the_first_todo_item_to_delete_it()  {
		driver.findElement(By.xpath("html/body/ng-view/section/section/ul/li[1]/div/button")).click();
		Log.info("User selects the first todo item to delete it");
	}
	
	@Then("^User selects the Active tab to see the active todos$")
	public void user_selects_the_Active_tab_to_see_the_active_todos()  {
		driver.findElement(By.xpath("html/body/ng-view/section/footer/ul/li[2]/a")).click();
		Log.info("User selects the Active tab to see the active todos");
	}
	
	@Then("^User selects the Completed tab to see the Completed todos$")
	public void user_selects_the_Completed_tab_to_see_the_Completed_todos()  {
		driver.findElement(By.xpath("html/body/ng-view/section/footer/ul/li[3]/a")).click();
		Log.info("User selects the Completed tab to see the Completed todos");
	}

}
