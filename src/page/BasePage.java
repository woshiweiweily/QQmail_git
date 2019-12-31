package page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	/*
	 * 初始化
	 */
	public void init(String relativepath){		
		System.setProperty("webdriver.chrome.driver",relativepath+"\\chromedriver.exe");  
	}
	/*
	 * 窗口最大化
	 */
	public void maxwindow(){
		this.driver.manage().window().maximize();
	}
	/*
	 * 跳到某个页面
	 */
	public void geturl(String url){
		this.driver.get(url);
	}
}
