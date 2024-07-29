package NativeApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Fdroid_Demo extends Fdroid_capabilities {

	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		driver= Capabalities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@Test(enabled = false)
	public void Notification() {
		
		//opening nnotification
		driver.openNotifications();
		
		//turn on battery saver
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		
		//turn of bttery saver
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		
		

	}
	
	
	@Test(enabled = true)
	public void test() {
		
		
		
		 //driver.findElementByAccessibilityId("Install").click();
		
		driver.findElement(MobileBy.AccessibilityId("Categories")).click();
		
		
		
	}
	
	@AfterTest
	public void at() {
		//driver.quit();
	}
}
