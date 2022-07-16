package com.wmp.qa.ui.pages;

import com.wmp.qa.uicore.actions.Common;
import com.wmp.qa.uicore.page.BasicPage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * LoginPage.java - LoginPage page related elements and behaviours
 *
 * @author WMP
 * @version 1.0-SNAPSHOT Last modified
 * @since 2022/06/22
 */

public class LoginPage extends BasicPage {

	final static Logger log = Logger.getLogger(LoginPage.class);

	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement txtUserName;
	@FindBy(how = How.ID, using = "txtPassword")
	private WebElement txtPassWord;
	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement btnLogin;
	@FindBy(how = How.XPATH, using = "//span[@id='spanMessage']")
	private WebElement spnInvalidLoginMsg;


	/**
	 * Initiate - Page components
	 *
	 * @param driver driver instance
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
		initializeElements(this);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Login into application
	 *
	 * @param username
	 * @param password
	 */
	public DashboardPage Step_Enter_Login_Credentials(String username, String password) {
		txtUserName.sendKeys(username);
		txtPassWord.sendKeys(password);
		btnLogin.click();
		return new DashboardPage(driver);
	}

	public LoginPage Check_And_Validate_Invalid_User_Login() {
		Common.waitFor(2000);
		Assert.assertTrue(spnInvalidLoginMsg.getText() != null);
		return this;
	}

}
