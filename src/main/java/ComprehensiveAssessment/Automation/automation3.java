package ComprehensiveAssessment.Automation;



	import java.io.IOException;
	import java.util.ArrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class automation3 {

		public static void main(String[] args) throws InterruptedException,IOException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://tide.com/en-us");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='lilo3746-close-link lilo3746-close-icon']")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@href='/en-us/contact-us']")).click();
			
		//	driver.findElement(By.xpath("(//*[@class='articleLink'])[1]")).click();
			}

}
