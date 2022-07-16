package com.wmp.qa.ui.panels;

import com.wmp.qa.uicore.page.BasicPage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderPanel extends BasicPage {

	@FindBy(how = How.ID, using = "MP_link")
	private WebElement btnMktPlace;

	@FindBy(how = How.ID, using = "welcome")
	private WebElement lnkWelcome;

	@FindBy(how = How.XPATH, using = "//*[contains(@href, 'logout')]")
	private WebElement lnkLogout;

	@FindBy(how = How.ID, using = "menu_admin_viewAdminModule")
	private WebElement lnkAdminMenu;

	public HeaderPanel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToAdmin() {
		lnkAdminMenu.click();
	}
	
	public void performMarketPlace() {
		btnMktPlace.click();
	}
	
	public void isCorrectUserLogged() {
		Assert.assertTrue(lnkWelcome.isDisplayed(), "Verify success login");

	}
	
	public void perform_Logout() {
		lnkWelcome.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lnkLogout.click();
	}
}
