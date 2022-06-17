package test_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	public Properties pro;
	public FileInputStream fis;
	String path=System.getProperty("user.dir")+"/src/test/resources/config.properties";
	public static WebDriver driver;


	@BeforeSuite
	public void openBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.manage().window().maximize();

		//Properties class for uploading properties file
		pro=new Properties();
		fis=new FileInputStream(path);
		pro.load(fis);
		//driver.get("https://www.facebook.com/");
		driver.get(pro.getProperty("url"));

		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
