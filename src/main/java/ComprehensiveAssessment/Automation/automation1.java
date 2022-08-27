package ComprehensiveAssessment.Automation;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation1 {

	public static void main(String[] args) throws InterruptedException,IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='event_internal_link']")).click();
		
		ArrayList<String> id=new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(id.get(1));
		
		driver.findElement(By.xpath	("//*[@id='name']")).click();
		driver.findElement(By.xpath	("//*[@id='name']")).sendKeys("Deepthi");
		
		driver.findElement(By.xpath	("//*[@id='email']")).click();
		driver.findElement(By.xpath	("//*[@id='email']")).sendKeys("deepthigurumurthi@gmail.com");
		
		driver.findElement(By.xpath	("//*[@id='password']")).click();
		driver.findElement(By.xpath	("//*[@id='password']")).sendKeys("Ruby@1606");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
	}

}
