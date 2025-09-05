package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public WebDriver driver;

    public void setup(){
        ChromeOptions options = new ChromeOptions();
        Map<String,Object>prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications",1);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://qa-dataportal.greatergas.com/");
    }


}
