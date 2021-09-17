/* How To Close The Browser*/
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		new ChromeDriver().close();
	}

}
