/* How To Close The Browser */
package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefox {

	public static void main(String[] args) {

       System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		new FirefoxDriver().close();
	}

}
