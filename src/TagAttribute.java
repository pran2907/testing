import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url ="https://facbook.com";
		driver.get(url);
		WebElement  email =driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		email.sendKeys("pranjal@gmail.com");
		WebElement  pass =driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
		pass.sendKeys("pranjal@gmail.com");
		Thread.sleep(3000);
		driver.close();
	}

}
