package src;
import java.util.Scanner;
//
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//was to title and current url
public class GetUrlAndTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser");
		String browser = sc.next();
		if(browser.equalsIgnoreCase("chrome"))
		{
		//	ChromeDriver c = new ChromeDriver();
			test(c);
		}
		else 
		{
			FirefoxDriver f = new FirefoxDriver();
			test1(f);
		}
	}
		public static void test(ChromeDriver driver)
		{
			driver.get("https://www.gmail.com");
			String title = driver.getTitle();
			System.out.println(title);
			String curl = driver.getCurrentUrl();
			System.out.println(curl);
			driver.close();
		}
		public static void test1(FirefoxDriver driver) 
		{
			driver.get("https://www.gmail.com");
			String title = driver.getTitle();
			System.out.println(title);
			String curl = driver.getCurrentUrl();
			System.out.println(curl);
			driver.close();
		}
}
