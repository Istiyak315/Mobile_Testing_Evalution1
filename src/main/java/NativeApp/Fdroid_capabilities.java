package NativeApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Fdroid_capabilities {
	
	public static AndroidDriver<AndroidElement> Capabalities() throws MalformedURLException {
		DesiredCapabilities dc= new DesiredCapabilities();
		
		//i am using this dc object to give information about the emulator and the app that i want to open
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My_emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.fdroid.fdroid");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.fdroid.fdroid.views.main.MainActivity");

		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;		
				
	}

}
