package com.itokoton.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	WebDriver driver;
	Properties prop;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

	public WebDriver init_driver(Properties prop) throws Exception {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			if (System.getProperty("browser").equals("headless")) {
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless", "--disable-gpu", "--window-size=1366,768",
						"--ignore-certificate-errors");
//				driver = new ChromeDriver(options);
				tldriver.set(new ChromeDriver());
			} else {
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
				tldriver.set(new ChromeDriver());
			}
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// driver = new FirefoxDriver();
			tldriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			// driver = new SafariDriver();
			tldriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser name....");
		}
		getDriver().manage().window().fullscreen();
		getDriver().manage().deleteAllCookies();
//		getDriver().get(System.getProperty("appurl")); // this is for running scripts by giving apprul in cmd prompt
		getDriver().get(prop.getProperty("appurl"));
		return getDriver();
	}

	public Properties init_properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\itokoton\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static String takeScreenShot(String screenShotName) throws IOException {

		String df = new SimpleDateFormat("yyyyMMdd-HHss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\target\\surefire-reports\\Failed_Tests_Screenshots\\"
				+ screenShotName + df + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
}
