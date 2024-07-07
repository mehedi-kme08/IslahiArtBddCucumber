package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Reusablefunctions;
import myhooks.Hook;

public class LoginPage {

	WebDriver driver;
	Reusablefunctions reusableFunctions;
	
	public LoginPage(WebDriver driver) {
		this.driver=Hook.driver;
		this.reusableFunctions=new Reusablefunctions(driver);
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="(//ul[@class='xoo-el-tabs']/li[@data-tab='login'])[1]")
	WebElement loginTab;
	
	@FindBy(xpath="//div[@class='elementor-element elementor-element-a82d6aa elementor-widget elementor-widget-shortcode']//div[@class='xoo-aff-group xoo-aff-cont-text one xoo-aff-cont-required xoo-el-username_cont']//input")
	WebElement username;
	
	@FindBy(xpath="//div[contains(@class,'elementor-element elementor-element-a82d6aa elementor-widget elementor-widget-shortcode')]//div[contains(@class,'xoo-el-section xoo-el-active')]//input[contains(@placeholder,'Password')]")
	WebElement password;
	
	@FindBy(xpath="//div[contains(@class,'elementor-element elementor-element-a82d6aa elementor-widget elementor-widget-shortcode')]//button[contains(@type,'submit')][normalize-space()='Sign in']")
	WebElement loginButton;


	public void clickloginTab() {
		reusableFunctions.click(loginTab);
	}
	
    public void enterEmail(String user) {
    	username.sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    	
	
	public void clickloginnButton() {
		reusableFunctions.click(loginButton);
	}
	
}