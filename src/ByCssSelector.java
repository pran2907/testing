import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url ="https://facbook.com";
		driver.get(url);
		WebElement  email =driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("pranjal@gmail.com");
		Thread.sleep(3000);
		driver.close();
	}

}
