package org.panneer.com.generalLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://tus.io/demo.html");
		driver.findElementByXPath("/html/body/div/div[3]/div/p[3]/input").click();
		Thread.sleep(5000);
		try {
			Runtime.getRuntime().exec("./exe/RunTinyUpload.exe");
		} catch (IOException e) {
			System.out.println("File not found");
		}
		driver.close();	
	}

}
