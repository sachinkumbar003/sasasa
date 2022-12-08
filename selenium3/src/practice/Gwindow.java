package practice;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Gwindow {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
     WebElement ele = driver.findElement(By.xpath("//a[.='हिन्दी']"));
     Actions act = new Actions(driver);
     act.contextClick(ele).perform();
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_T);
     r.keyRelease(KeyEvent.VK_T);
     String w = driver.getWindowHandle();
    Set<String> aw = driver.getWindowHandles();
    ArrayList<String> x = new ArrayList<String>(aw);
   int ss = x.size();
   System.out.println(ss);
   String l = x.get(1);
   driver.switchTo().window(l);
   Thread.sleep(2000);
   WebElement ele1 = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
   act.contextClick(ele1).perform();
   r.keyPress(KeyEvent.VK_T);
   r.keyRelease(KeyEvent.VK_T);
   Set<String> mm = driver.getWindowHandles();
   ArrayList<String> kk = new ArrayList<String>(mm);
   int zz = kk.size();
   System.out.println(zz);
  String move = kk.get(2);
  String zero = kk.get(0);
  driver.switchTo().window(move);
   Thread.sleep(1000);
   driver.switchTo().window(zero);
   Thread.sleep(1000);
   driver.close();
   driver.switchTo().window(move);
   Thread.sleep(1000);
   driver.close();
   Thread.sleep(1000);
   driver.quit();
   
     
     
     
	}

}
