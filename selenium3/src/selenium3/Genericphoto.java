package selenium3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genericphoto {
	public static void getphoto(WebDriver driver) throws IOException{
		
		String photo = "./photos/";
		
		Date d = new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
		File dest = new File("photo+d2+jpeg");
		FileUtils.copyFile(src, dest);	}

}
