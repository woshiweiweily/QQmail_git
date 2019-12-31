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
	 //��ȡ��Ŀ·��
	 String relativepath = System.getProperty("user.dir");
  @BeforeTest
  public void beforeTest() {
	  
	  //��ʼ��
	  System.setProperty("webdriver.chrome.driver",relativepath+"\\chromedriver.exe");
	  driver = new ChromeDriver();
      //���
	  driver.manage().window().maximize();
	  //������ַ
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
	  sendmail.Sendmail("632178883@qq.com", "selenium�Զ������ʼ�", "POMģʽ���۹�����");
	  Assert.assertEquals(driver.findElement(By.id("sendinfomsg")).getText(), "�����ʼ��ѷ���");
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}


