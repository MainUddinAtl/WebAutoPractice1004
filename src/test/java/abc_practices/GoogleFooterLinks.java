package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chorme.driver",
				"C:\\Users\\Main Uddin\\workspace\\Introduction\\ChromeDriver.exe");
		driver = new ChromeDriver();
		
		GoogleFooterLinks obj = new GoogleFooterLinks();
		
		obj.privacy(driver);
		obj.terms(driver);
		obj.closeBrowser( driver);
		//driver.manage().window().maximize();
		/*
		 * System.setProperty("webdriver.chorme.driver",
		 * "C:\\Users\\Main Uddin\\workspace\\Introduction\\ChromeDriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * // Test-1: open google and then click on Privacy link
		 * driver.get("https:www.google.com"); // Thread.sleep(30000);
		 * driver.findElement(By.xpath("//*[@id=\'fsr\']/a[1]")).click(); // find and
		 * click on privacy link // Verify clicking on the privacy link and verify the
		 * info is exist // String privacyTxt = // driver.findElement(By.xpath(
		 * "//*[@id=\\\"yDmH0d\\\"]/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]"))
		 * .getText();
		 * 
		 * System.out.println( driver.findElement(By.xpath(
		 * "//*[@id='yDmH0d']/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]"))
		 * .getText());
		 * 
		 * /// System.out.println(privacyTxt);
		 * 
		 * // Boolean privacyDIsplay = // driver.findElement(By.xpath(
		 * "//*[@id=\"yDmH0d\"]/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]")).
		 * isDisplayed(); // System.out.println(privacyDIsplay); // output: True //
		 * privacyDIsplay.g
		 * 
		 * //
		 * 
		 * // Test-1
		 * 
		 * // driver.close();
		 * 
		 */

	}

	public void privacy(WebDriver driver) {
		launchUrl(driver);
		// Test-1: open google and then click on Privacy link
		//driver.get("https:www.google.com");
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'fsr\']/a[1]")).click(); // find and click on privacy link
		// Verify clicking on the privacy link and verify the info is exist
		// String privacyTxt =
		// driver.findElement(By.xpath("//*[@id=\\\"yDmH0d\\\"]/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]")).getText();

		//System.out.println(
				//driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]"))
						//.getText());
		if (driver.getPageSource().contains(driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]"))
				.getText())) {
			System.out.println("The privacy link test is passed ");
		} else {
			System.out.println("The test is failed ");
		}

		

	}

	public static void launchUrl(WebDriver driver) {
		
		driver.get("https:www.google.com");
		//driver.manage().window().maximize();
	}
	
	public void terms(WebDriver driver) {
		launchUrl(driver);
		// Test-1: open google and then click on Privacy link
		//driver.get("https:www.google.com");
		driver.findElement(By.xpath("//*[@id='fsr']/a[2]")).click(); // tagname[attribute = value]
		if (driver.getPageSource().contains("By using our Services, you are agreeing to these terms")) {
			System.out.println("The terms link test is passed ");
		} else {
			System.out.println("The test is failed ");
		}

	}

	public void closeBrowser(WebDriver driver) {
		System.out.println("The project is completed");
		driver.quit();
	}
	
}
