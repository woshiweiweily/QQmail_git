package Action;

import org.openqa.selenium.WebDriver;

import page.SendmailPage;

public class SendmailAction extends SendmailPage{
	public SendmailAction(WebDriver driver){
		super(driver);
	}
	
	public void Sendmail(String receiver,String subject,String content) throws InterruptedException{
		SendmailBtn().click();
		Thread.sleep(3000);
		MainFrame();
		Receive().sendKeys(receiver);
		Subject().sendKeys(subject);
		EditFrame();
		Content().sendKeys(content);
		this.driver.switchTo().parentFrame();
		SendBtn().click();
		Thread.sleep(3000);
	}

}
