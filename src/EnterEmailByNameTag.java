import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//was to enter the emailid and passward by.nametag
public class EnterEmailByNameTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://facebook.com";
		driver.get(url);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("pranjal@gmail.com");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("pranjal");
		driver.close();
	}

}
