import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagClassAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window();
		String url ="https://www.gmail.com";
				driver.get(url);
				WebElement email =driver.findElement(By.xpath("//input[@id='identifierId']"));
				email.sendKeys("pranjal@gmail.com");
				Thread.sleep(2000);
				driver.close();
		
	}

}
