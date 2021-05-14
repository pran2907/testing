import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch11 {
    public static void main(String[] args) { // TODO Auto-generated method stub                  
  //System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");         
  WebDriver driver=new FirefoxDriver();         
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);                  
  driver.manage().window().maximize();                  //Opening the air bnb home page         
  driver.get("https://www.airbnb.co.in/");                  //Locating location field for the search  form via class name         
  driver.findElement(By.className("_up0kwni")).sendKeys("Goa", Keys.ENTER);           
  //Locating check-in field for the search  form via class name         
  driver.findElement(By.className("_14fdu48d")).click();  
  //Locating the date 12th June for check-in field         
  driver.findElement(By.className("_1wh4xpp1")).click(); 
  //closing the driver         
  driver.quit();                                      
}
}
