package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
	public void screenshot(WebDriver driver,String name) throws IOException {
		TakesScreenshot scr=(TakesScreenshot)driver;
		File image=scr.getScreenshotAs(OutputType.FILE);
	//	File path= new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
		 FileHandler.copy(image, new File("./Screenshot/"+name+".png"));
	//	FileHandler.copy(image, path);
		System.out.println("Screenshot captured");
	}
}
