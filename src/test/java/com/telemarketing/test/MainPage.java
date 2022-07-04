package com.telemarketing.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	
	protected WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// pop up at main page
	@FindBy(xpath = "//p[normalize-space()='Welcome to Tele Kita']")
	public WebElement txtPopUpOnMainPage;
	@FindBy(xpath = "//span[normalize-space()='OK']")
	public WebElement btnOKPopUpOnMainPage;
	@FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
	public WebElement btnClosePopUpOnMainPage;

	@FindBy(xpath = "//font[normalize-space()='Tele Marketing']")
	protected WebElement txtMainPage;

	public String txtMainPage() {
		return txtMainPage.getText();
	}
	
	public void clickOk() {
		btnOKPopUpOnMainPage.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='DEVELOPER']")
	public WebElement btnLogoutMainPage;
	
	// pop out logout
	@FindBy(xpath = "//span[@id='ui-id-21']")
	public WebElement txtPopUpLogout;
	@FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
	public WebElement btnClosePopUpLogout;
	@FindBy(xpath = "//span[normalize-space()='TIDAK']")
	public WebElement btnNoLogout;
	@FindBy(xpath = "//span[normalize-space()='YA']")
	public WebElement btnYesLogout;
	
	
	
	
}
