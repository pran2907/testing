
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Write a program to get the url of the website

public class GoToWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.driver","C:\\selenium components\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url="https://www.gmail.com";
		driver.get(url);
			Thread.sleep(5000);
		driver.close();
		
	}

}
