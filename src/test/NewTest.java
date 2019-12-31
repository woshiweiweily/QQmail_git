package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import Action.LoginAction;
import Action.SendmailAction;

public class NewTest {
	WebDriver driver = null;
	 //获取项目路径
	 String relativepath = System.getProperty("user.dir");
  @BeforeTest
  public void beforeTest() {
	  
	  //初始化
	  System.setProperty("webdriver.chrome.driver",relativepath+"\\chromedriver.exe");
	  driver = new ChromeDriver();
      //最大化
	  driver.manage().window().maximize();
	  //访问网址
	  driver.get("http://mail.qq.com");  
  }
	
  
  public void loginTest() throws InterruptedException {
	  LoginAction login = new LoginAction(driver);
	  login.Login("632178883@qq.com","Sh@nghai186");
	  Assert.assertEquals(driver.findElement(By.id("useraddr")).getText(),"632178883@qq.com");
  }
  
  @Test
  public void QQLoginTest() throws InterruptedException{
	  LoginAction login = new LoginAction(driver);
	  login.QQLogin();
	  Assert.assertEquals(driver.findElement(By.id("useraddr")).getText(),"632178883@qq.com");
  }
  
  @Test
  public void sendmailTest() throws InterruptedException {
	  SendmailAction sendmail = new SendmailAction(driver);
	  sendmail.Sendmail("632178883@qq.com", "selenium自动发送邮件", "POM模式，哇哈哈哈");
	  Assert.assertEquals(driver.findElement(By.id("sendinfomsg")).getText(), "您的邮件已发送");
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}


