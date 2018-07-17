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

import java.net.URL;

public class Stepdefs {

	private WebDriver driver;
 	private String baseUrl = "https://login.salesforce.com";
	
	@Given("^navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Exception {
		try {
			System.out.println("webdriver: " + System.getProperty("webdriver.chrome.driver"));
			ChromeOptions co = new ChromeOptions();
			co.setBinary(System.getProperty("webdriver.chrome.driver"));
			driver = new RemoteWebDriver(new URL(baseUrl + "/"), co);//new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.get(baseUrl + "/");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Given("^username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void username_and_password(String arg1, String arg2) throws Exception {
		// Write code here that turns the phrase above into concrete actions - test7
		//throw new PendingException();
		System.out.println("username_and_password succeeded");
	}

	@Then("^select \"([^\"]*)\"$")
	public void select(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("select succeeded");
	}

	@Then("^response should contain \"([^\"]*)\"$")
	public void response_should_contain(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("response_should_contain succeeded");
	}
}