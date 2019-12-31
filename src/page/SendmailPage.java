package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendmailPage extends BasePage{
	public SendmailPage(WebDriver driver){
		super(driver);
	}
	
	/*
	 * 写信按钮
	 */
	By sendmailbtn = By.linkText("写信");
	/*
	 * mainFrame
	 */
	By maiframe = By.id("mainFrame");
	/*
	 * 收件人
	 */
	By receiver = By.cssSelector("#toAreaCtrl > div.addr_text > input");
	/*
	 * 主题
	 */
	By subject = By.id("subject");
	/*
	 * 附件
	 */
	By attach = By.id("AttachFrame");
	/*
	 * 写信frame
	 */
	By editframe = By.className("qmEditorIfrmEditArea");
	/*
	 * 邮件内容
	 */
	By content = By.tagName("body");
	/*
	 * 发送按钮
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
