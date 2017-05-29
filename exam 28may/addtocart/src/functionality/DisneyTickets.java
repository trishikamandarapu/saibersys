package functionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisneyTickets {

	public static void main(String[] args) throws InterruptedException {
	{
	System.setProperty("webdriver.chrome.driver", "F:\\JAVA\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Open URL
	driver.get("http://disneyworld.disney.go.com/tickets/");
	
	//Choosing the element/
	driver.findElement(By.xpath(".//*[@id='pepDayScroller_numDays']/div[2]/a/div[2]")).click();
	Thread.sleep(5000);
	// number of tickets module
	driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]")).click();
	Thread.sleep(5000);
	// selected the ticket of the theme park module
	driver.findElement(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[1]")).click();
	Thread.sleep(5000);
	// the functionality of add to cart is verified
   driver.findElement(By.xpath(".//*[@id='addToCart']")).click();
   Thread.sleep(5000);
   //  checked the functionality by checking out
   driver.findElement(By.id("checkOutLoginButton")).click();
   driver.close();
   
	}
	
}
}
	


