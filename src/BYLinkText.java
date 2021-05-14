import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BYLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com";
		driver.get(url);
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		link.click();
		Thread.sleep(1000);
		driver.close();
	}

}
