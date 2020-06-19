package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");
	By signup = By.cssSelector("a[href*='sign_up']");
	By title = By.cssSelector(".text-center>h2");
	By navigationBar= By.cssSelector("ul[class*='navbar-right']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// Signin
	public WebElement getlogin() {

		return driver.findElement(signin);
	}

	// Sign up

	public WebElement getsignup() {

		return driver.findElement(signup);
	}
	
	public WebElement getTitle() {

		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar() {

		return driver.findElement(navigationBar);
	}



}
