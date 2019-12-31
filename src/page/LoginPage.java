package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	/*
	 * login_frame
	 */
	By loginframe = By.id("login_frame");
	/*
	 * ÕËºÅµÇÂ¼ÇÐ»»°´Å¥
	 */
	By switcher = By.id("switcher_plogin");
	/*
	 * ÓÃ»§Ãû
	 */
	By username = By.id("u");
	/*
	 * ÃÜÂë
	 */
	By password = By.id("p");
	/*
	 * µÇÂ¼°´Å¥
	 */
	By loginbtn = By.id("login_button");
	/*
	 * QQºÅÂëÖ±½ÓµÇÂ¼Í¼Æ¬
	 */
	By qqbtn = By.id("img_out_632178883");
	
	
	public void LoginFrame(){
		this.driver.switchTo().frame(this.driver.findElement(loginframe));	
	}
	public WebElement LoginSwitch(){
		return this.driver.findElement(switcher);
	}
	public WebElement LoginUsername(){
		return this.driver.findElement(username);
	}
	public WebElement LoginPassword(){
		return this.driver.findElement(password);
	}
	public WebElement LoginBtn(){
		return this.driver.findElement(loginbtn);
	}
	public WebElement QQBtn(){
		return this.driver.findElement(qqbtn);
	}
}
