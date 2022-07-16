package com.wmp.qa.ui.pages;

import com.wmp.qa.ui.panels.HeaderPanel;
import com.wmp.qa.uicore.page.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * DashboardPage.java - DashboardPage page related elements and behaviours
 *
 * @author WMP
 * @version 1.0-SNAPSHOT Last modified
 * @since 2022/06/22
 */

public class DashboardPage extends BasicPage {

	HeaderPanel headerPanel;

	public DashboardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		headerPanel = new HeaderPanel(driver);
	}

	public DashboardPage Check_And_Validate_User_Logged() {
		headerPanel.isCorrectUserLogged();
		return this;
	}

	public LoginPage Step_Perform_Logout() {
		headerPanel.perform_Logout();
		return new LoginPage(driver);
	}

	public AdminPage Step_Navigate_To_AdminPage() {
		headerPanel.navigateToAdmin();
		return new AdminPage(driver);

	}
}
