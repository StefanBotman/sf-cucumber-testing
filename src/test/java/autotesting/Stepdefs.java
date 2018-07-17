package autotesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stepdefs {

	private WebDriver driver;
 	private String baseUrl;
	
	@Given("^navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Exception {
		System.getProperties().list(System.out);
		driver = new RemoteWebDriver(new ChromeOptions());//new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/");
	}

	@Given("^username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void username_and_password(String arg1, String arg2) throws Exception {
		// Write code here that turns the phrase above into concrete actions - test5
		throw new PendingException();
	}

	@Then("^select \"([^\"]*)\"$")
	public void select(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^response should contain \"([^\"]*)\"$")
	public void response_should_contain(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}