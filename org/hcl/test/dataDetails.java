package org.hcl.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDetails {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\param\\eclipse-workspace\\UserData\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement txtuserid = driver.findElement(By.xpath("//img[@id='user-id-goahead'][1]"));
	txtuserid.click();
	WebElement txtuserid1 = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	txtuserid1.sendKeys("9751772271");
	WebElement txtmobileno1 = driver.findElement(By.xpath("//input[@class='IP']"));
	txtmobileno1.sendKeys("9751772271");
	WebElement txtAddress = driver.findElement(By.xpath("//input[@class='login_form-control ng-pristine ng-untouched ng-valid'][1]"));
	txtAddress.sendKeys("70th street");
	
	
	
	
	
	
	
	
	
	
	System.out.println("erstdfy");
	
	
	
	
	
	
	
	
	
	//driver.quit();
			
}
}
