import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//wap to maximize the browser
public class MaximizeBrowser {
	public static void main(String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
}
