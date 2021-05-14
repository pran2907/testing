import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window();
		String url ="https://facebook.com";
		driver.get(url);
		WebElement link = driver.findElement(By.partialLinkText("forgotten"));
		link.click();
	}

}
