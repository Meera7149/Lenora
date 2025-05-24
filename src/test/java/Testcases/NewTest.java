package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

	ChromeDriver driver=new ChromeDriver(options);
	Thread.sleep(1000);
	driver.get("http://100.100.60.116/srx/login/");
	driver.findElement(By.xpath("//*[@id='sign_in_username_email']")).sendKeys("warren");
	driver.findElement(By.xpath("//*[@id='sign_in_password']")).sendKeys("warren");
	Thread.sleep(1000);
	driver.close();
  }
  
}
