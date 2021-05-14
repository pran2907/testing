import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//write a script to verify the title of given url
public class GetTitle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.gmail.com";
		driver.get(url);
		String etitle="gmail";
		String atitle=driver.getTitle();
		System.out.println(etitle);
		System.out.println(atitle);
		if(etitle.equalsIgnoreCase(atitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}