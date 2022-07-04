package com.telemarketing.test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class NavigationTest {
	
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected MainPage mainPage;
	
	public void delay(int inInt) {
		try {
			Thread.sleep(inInt*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void init() {
		System.setProperty("url", "https://sqa.peluangkerjaku.com/tele/");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		loginPage = new LoginPage(driver);
		mainPage = new MainPage(driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(System.getProperty("url"));
	}

	@BeforeMethod
	public void cekSession() {
		driver.get(System.getProperty("url"));
	}

	@org.testng.annotations.Test(priority = 1)
	public void test_show_login_page() {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		MainPage mainPage = loginPage.login_goto_main_page("developer", "23");
		
		delay(1);
		
		System.out.println("login berhasil");
		
		delay(2);
		
		
		assertEquals(mainPage.txtPopUpOnMainPage.getText(), "Welcome to Tele Kita");
		mainPage.btnOKPopUpOnMainPage.click();
		System.out.println("click ok");
		
		assertEquals(mainPage.txtMainPage(), "Tele Marketing");
		delay(1);
		
		mainPage.btnLogoutMainPage.click();
		delay(1);
		mainPage.btnYesLogout.click();
		
	}
}
