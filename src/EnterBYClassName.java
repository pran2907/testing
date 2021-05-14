import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterBYClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Chrome.driver","C:\\selenium components\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com";
		driver.get(url);
		WebElement email = driver.findElement(By.className("inputtext"));
		email.sendKeys("mail@gmail.com");
		Thread.sleep(2000);
		driver.close();
		
	}

}
