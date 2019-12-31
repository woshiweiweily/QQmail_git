package page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	/*
	 * ��ʼ��
	 */
	public void init(String relativepath){		
		System.setProperty("webdriver.chrome.driver",relativepath+"\\chromedriver.exe");  
	}
	/*
	 * �������
	 */
	public void maxwindow(){
		this.driver.manage().window().maximize();
	}
	/*
	 * ����ĳ��ҳ��
	 */
	public void geturl(String url){
		this.driver.get(url);
	}
}
