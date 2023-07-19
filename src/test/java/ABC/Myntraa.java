package ABC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntraa {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiVr6DvmZuAAxVhGoMDHbw6AL8YABAAGgJzZg&ohost=www.google.com&cid=CAESbeD2E7ptQIXK1FTa7KaZX3Sa3Rm4FDXjJnBHqwIixRpK2tOKZOlPHlt-dfZbC0aQCrta7M96n74J6wIT2QXFLUSkTe9GR_E9R4Rsz_vHeX1Xd-AovqBzvLiKO8Pr3uC68aflhYWAhOjUZ3Wtry4&sig=AOD64_2ed9dyj5V9GSXfMwtgHcBqilmj4A&q&adurl&ved=2ahUKEwiNjJrvmZuAAxXdT2wGHQMSAd8Q0Qx6BAgGEAE");
	  driver.close();
	  
  }
}
