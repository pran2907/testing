import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Substring {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window();
		String url ="https//www.facebook.com";
		driver.get(url);
		WebElement email = driver.findElement(By.cssSelector("input[id^='iden']"));
		email.sendKeys("pranjal@gmail.com");
		Thread.sleep(3000);
		driver.close();
	}

}
