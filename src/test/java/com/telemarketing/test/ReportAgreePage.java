package com.telemarketing.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportAgreePage {

	protected WebDriver driver;

	@FindBy(xpath = "//input[@value='REPORT SETUJU']")
	public WebElement txtReportAgree;
	@FindBy(xpath = "(//span[@class='ui-button-text'])[31]")
	public WebElement btnView;
	
	
	public ReportAgreePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTxtReportAgree() {
		
		return txtReportAgree.getAttribute("value");
	}
	
	public void clickView() {
		btnView.click();
	}
	
	
}
