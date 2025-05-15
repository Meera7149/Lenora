package Testcases;

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
	//Thread.sleep(1000);
	driver.get("https://chatgpt.com/");
	Thread.sleep(1000);
	driver.close();  
  }
  
}
