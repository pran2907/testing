import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//was to enter the email id in email field through By.id
public class EnterEmailById {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://facebook.com";
		driver.get(url);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pranjal@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("pranjal");
		Thread.sleep(5000);
		driver.close();
	}

}
