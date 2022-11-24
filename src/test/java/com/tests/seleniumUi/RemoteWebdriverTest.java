package com.tests.seleniumUi;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteWebdriverTest {
	
	
	
	@Test
	
	public void runTestonRemoteWebdriver() throws MalformedURLException {
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		//chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, "Windows XP");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
		driver.get("http://www.google.com");
		driver.quit();
		
	}

}
