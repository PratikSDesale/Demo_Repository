package ABC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(1000);
	  driver.get("https://www.meesho.com/");
	  driver.close();
	  
  }
}
