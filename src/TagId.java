import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		String url ="https://www.facebook.com";
		driver.get(url);
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("pranjal@gmail.com");
		Thread.sleep(2000);
		driver.close();
	}

}
