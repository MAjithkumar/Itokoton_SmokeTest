package com.itokoton.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;
	static WebDriverWait wait;
	WebElement element;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 45);
	}

//	Locators
//	@FindBy(how = How.ID, using = "spin_modal_overlay") static WebElement SPINNER_ICON; 
	@FindBy(id = "spin_modal_overlay")
	static By SPINNER_ICON;

	public void visibilityOfElementWait(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (TimeoutException e) {
			throw new NoSuchElementException(locator.toString());
		}
	}

	public void inVisibilityOfElementWait(By locator) {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		} catch (TimeoutException e) {
			throw new NoSuchElementException(locator.toString());
		}
	}

	public void jseScrollIntoView(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void jseClick(WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}

	public void inVisibilityOfSpinnerIcon() {
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(ElementUtil.SPINNER_ICON));
		} catch (TimeoutException e) {
			throw new NoSuchElementException(e.toString());
		}
	}

	private WebElement getElement(By locator) {
		return null;
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void ActionsClick(By locator) {
		try {
			Actions action = new Actions(driver);
			action.click(getElement(locator)).build().perform();
		} catch (Exception e) {
			System.out.println("some exception got occurred while clicking on the webelement : " + locator);
			System.out.println(e.getMessage());
		}
	}

	public void ActionsSendKeys(By locator, String... value) {
		try {
			Actions action = new Actions(driver);
			action.sendKeys(getElement(locator), value).build().perform();
		} catch (Exception e) {
			System.out.println("some exception got occurred while passing the values to the webelement : " + locator);
			System.out.println(e.getMessage());
		}
	}

	public void ActionsMoveToElement(By locator) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(getElement(locator)).build().perform();
		} catch (Exception e) {
			System.out.println("some exception got occurred while moving on the webelement : " + locator);
			System.out.println(e.getMessage());
		}
	}

	public boolean IsDisplayed(By locator) {

		boolean flag = false;
		try {
			flag = getElement(locator).isDisplayed();
		} catch (Exception e) {
			System.out
					.println("some exception got occurred while checking isDisplayed for the webelement : " + locator);
			System.out.println(e.getMessage());
		}
		return flag;
	}

	public void waitForPageTitle(String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void waitForElementPresent(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void SLEEP_500MS() throws InterruptedException {
		Thread.sleep(500);
	}

	public void SLEEP_1S() throws InterruptedException {
		Thread.sleep(1000);
	}

	public void SLEEP_2S() throws InterruptedException {
		Thread.sleep(2000);
	}

	public void SLEEP_3S() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void SLEEP_4S() throws InterruptedException {
		Thread.sleep(4000);
	}

	public void SLEEP_5S() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void SLEEP_6S() throws InterruptedException {
		Thread.sleep(6000);
	}

	public void SLEEP_7S() throws InterruptedException {
		Thread.sleep(7000);
	}

	public void SLEEP_8S() throws InterruptedException {
		Thread.sleep(8000);
	}

	public void SLEEP_25S() throws InterruptedException {
		Thread.sleep(25000);
	}

}
