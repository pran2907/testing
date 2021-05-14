import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByLinkText2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window();
		String url = "https://magento.com";
		driver.get(url);
		WebElement MyAccount = driver.findElement(By.linkText("My Account"));
		MyAccount.click();
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vineetananad61@gmail.com");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("vineetananad61@gmail.com");
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.linkText("Send2"));
		Login.click();
		driver.close();
		
	}

}
