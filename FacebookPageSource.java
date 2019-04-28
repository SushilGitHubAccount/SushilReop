package sushilPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookPageSource
{
@Test
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver d = new ChromeDriver(); //refer webdriver interface
d.manage().window().maximize(); //window maximize
d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
d.get("http://www.Facebook.com"); //opining websites
String ss =d.getPageSource();

WebElement un = d.findElement(By.xpath("//a[starts-with(@href,'http://register')"));
un.click();
Alert a = d.switchTo().alert();
String st=a.getText();
System.out.println(st);
Thread.sleep(5000);
a.accept();
a.dismiss();
}

}



