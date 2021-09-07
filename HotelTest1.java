import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class HotelTest1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashwin/Downloads/Drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://adactinhotelapp.com/";
		//driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		//Login Process
		driver.findElement(By.id("username")).sendKeys("ashwin21");
		driver.findElement(By.id("password")).sendKeys("7896541230");
		driver.findElement(By.id("login")).click();
		
		//Search Hotel Page
		//Location
		Select loc = new Select(driver.findElement(By.id("location")));
		loc.selectByIndex(6);
		loc.selectByVisibleText("Paris");
		// hotels
		Select na = new Select(driver.findElement(By.id("hotels")));
		na.selectByIndex(2);
		// room_type
		Select rt = new Select(driver.findElement(By.id("room_type")));
		rt.selectByIndex(3);
		// number of rooms
		Select nor = new Select(driver.findElement(By.id("room_nos")));
		nor.selectByIndex(3);
		// Date Check in Check Out
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("09/09/2021");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("11/09/2021");
		
		//Adults per room
		Select apr = new Select(driver.findElement(By.id("adult_room")));
		apr.selectByIndex(2);
		//Childs per room
		Select cr = new Select(driver.findElement(By.id("child_room")));
		cr.selectByIndex(2);
		//Submit button
		driver.findElement(By.id("Submit")).click();
		//radio button select
		driver.findElement(By.id("radiobutton_0")).click();
		
		//Continue Button
		driver.findElement(By.id("continue")).click();
		//Book Hotel payment page
		driver.findElement(By.id("first_name")).sendKeys("ABC");
		driver.findElement(By.id("last_name")).sendKeys("XYZ");
		driver.findElement(By.id("address")).sendKeys("qwertyuiopzxcvbnmasdfghjkl");
		driver.findElement(By.id("cc_num")).sendKeys("7894561237894560");
		
		//Credit Card type
		Select cc_t = new Select(driver.findElement(By.id("cc_type")));
		cc_t.selectByIndex(3);
		
		//CC expiry Date
		
		Select cc_ep_dt = new Select(driver.findElement(By.id("cc_exp_month")));
		cc_ep_dt.selectByIndex(12);
		
		Select cc_ep_yr = new Select(driver.findElement(By.id("cc_exp_year")));
		cc_ep_yr.selectByIndex(12);
		
		//CVV number
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		
		//Book now
		driver.findElement(By.id("book_now")).click();
		
		//Show Booking
		driver.findElement(By.id("my_itinerary")).click();
		
		
		
		
		//driver.close();
	}

}