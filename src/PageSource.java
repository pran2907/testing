import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSource {
	// write a scirpt to get the page source

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.google.com";
		driver.get(url);
		String ps = driver.getPageSource();
		System.out.println(ps);
		driver.close();
	}

}
