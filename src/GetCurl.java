import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//wap to get the current url
public class GetCurl {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url="https://www.gmail.com";
		driver.get(url);
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		driver.close();
		
	}

}