package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendmailPage extends BasePage{
	public SendmailPage(WebDriver driver){
		super(driver);
	}
	
	/*
	 * д�Ű�ť
	 */
	By sendmailbtn = By.linkText("д��");
	/*
	 * mainFrame
	 */
	By maiframe = By.id("mainFrame");
	/*
	 * �ռ���
	 */
	By receiver = By.cssSelector("#toAreaCtrl > div.addr_text > input");
	/*
	 * ����
	 */
	By subject = By.id("subject");
	/*
	 * ����
	 */
	By attach = By.id("AttachFrame");
	/*
	 * д��frame
	 */
	By editframe = By.className("qmEditorIfrmEditArea");
	/*
	 * �ʼ�����
	 */
	By content = By.tagName("body");
	/*
	 * ���Ͱ�ť
	 */
	By sendbtn = By.name("sendbtn");
	
	public WebElement SendmailBtn(){
		return this.driver.findElement(sendmailbtn);
	}
	public void MainFrame(){
		this.driver.switchTo().frame(this.driver.findElement(maiframe));
	}
	public WebElement Receive(){
		return this.driver.findElement(receiver);
	}
	public WebElement Subject(){
		return this.driver.findElement(subject);
	}
	public WebElement Attach(){
		return this.driver.findElement(attach);
	}
	public void EditFrame(){
		this.driver.switchTo().frame(this.driver.findElement(editframe));
	}
	public WebElement Content(){
		return this.driver.findElement(content);
	}
	public WebElement SendBtn(){
		return this.driver.findElement(sendbtn);
	}
}
