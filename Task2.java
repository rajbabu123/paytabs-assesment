package Paytabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task2 {
	

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin",Keys.TAB, "admin123",Keys.ENTER);
		 driver.findElement(By.xpath("//SPAN[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Admin']")).click();
		 driver.findElement(By.xpath("(//BUTTON[@type='button'])[4]")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'Select')][1]")).click();
		 driver.findElement(By.xpath("//div[@role='option']//span[1]")).click();
		 driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
		 driver.findElement(By.xpath("//span[text()='Enabled']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Na");
		 driver.findElement(By.xpath("//span[contains(text(),'Nathan  Elliot')]")).click();
		 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Rajbabu");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajbabu123@");
		 Thread.sleep(15000);
		 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Rajbabu123@");
		 Thread.sleep(15000);
		 driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("(//p[@class='oxd-userdropdown-name'])")).click();
		 driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout'][text()='Logout']")).click();
		 driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Rajbabu",Keys.TAB, "Rajbabu123@",Keys.ENTER);

}
}
