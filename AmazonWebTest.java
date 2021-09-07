package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver.*;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonWebTest {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp()throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/ashwin/Downloads/Drivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "http://www.amazon.in";
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9773224778");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("********");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphones");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}

}
