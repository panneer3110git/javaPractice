package org.panneer.com.generalLearning;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSnap {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		URL url = new URL("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.navigate().to(url);
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		String text = wait.until(ExpectedConditions.alertIsPresent()).getText();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new  Rectangle(screenSize);
		BufferedImage createScreenCapture = new Robot().createScreenCapture(rec);
		ImageIO.write(createScreenCapture, "jpeg", new File("./snaps/sc.jpg"));
		System.out.println(text);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		

	}

}
