package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooter {
	//test -1:  privacy link
	public void privacy() {
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Main Uddin\\workspace\\Introduction\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Test-1: open google and then click on Privacy link
		driver.get("https:www.google.com");
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id=\'fsr\']/a[1]")).click(); // find and click on privacy link
		//Verify clicking on the privacy link and verify the info is exist
		//String privacyTxt = driver.findElement(By.xpath("//*[@id=\\\"yDmH0d\\\"]/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]")).getText();
		//Test-1: open google and then click on Privacy link
				//driver.get("https:www.google.com");
		
		System.out.println(" It's Mosarrof");
		System.out.println(driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[2]/div[3]/c-wiz/div[1]/div/p[1]")).getText());
	}

}
