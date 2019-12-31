package Action;

import org.openqa.selenium.WebDriver;

import page.LoginPage;

public class LoginAction extends LoginPage{
	public LoginAction(WebDriver driver){
		super(driver);
	}
	public void Login(String username,String password) throws InterruptedException{
		LoginFrame();
		LoginSwitch().click();
		LoginUsername().sendKeys(username);
		LoginPassword().sendKeys(password);
		LoginBtn().click();
		Thread.sleep(3000);
	}
	
	public void QQLogin() throws InterruptedException{
		LoginFrame();
		QQBtn().click();
		Thread.sleep(3000);
	}
}
