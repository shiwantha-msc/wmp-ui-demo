package com.wmp.qa.ui.pages;

import com.wmp.qa.uicore.actions.Common;
import com.wmp.qa.uicore.page.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Admin_UserMgr.java - Admin_UserMgr page related elements and behaviours
 *
 * @author WMP
 * @version 1.0-SNAPSHOT Last modified
 * @since 2022/06/22
 */

public class AdminPage extends BasicPage {

	@FindBy(how = How.ID, using = "searchSystemUser_userName")
	private WebElement txtSearchUser;

	@FindBy(how = How.ID, using = "searchBtn")
	private WebElement btnSearchUser;

	/**
	 * Initiate - Page components
	 *
	 * @param driver driver instance
	 */
	public AdminPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public AdminPage Step_Search_User(String name) {
		txtSearchUser.sendKeys(name);
		Common.waitFor(2000);
		btnSearchUser.click();
		return this;
	}
	
}
