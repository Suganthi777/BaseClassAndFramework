package org.BaseFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {

		driver.manage().window().maximize();

	}

	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fillTextBox(WebElement name, String data) {
		name.sendKeys(data);

	}

	public static void btnClick(WebElement ele) {
		ele.click();

	}

	public static void clickDouble(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void contextClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick().perform();

	}

	public static void moveToElement(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele);

	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des);

	}

	public static void tabOption() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void scrollDownUp(Boolean yesorno, WebElement ele) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + yesorno + ")", ele);

	}

	public static void getAttribute(WebElement ele) {

		js = (JavascriptExecutor) driver;
		js.executeScript("returnarguments[0].getAttribute('value')" + ele);

	}
	

}
