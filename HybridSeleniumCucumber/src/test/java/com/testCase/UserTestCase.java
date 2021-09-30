package com.testCase;

import java.io.IOException;

import javax.naming.directory.SearchResult;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;
import com.pages.UserPage;
public class UserTestCase extends Library {
	   @BeforeTest
	    public void stratUp() {
		   launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		   LoginPage lpage=new LoginPage(driver);
	        lpage.login("Admin", "admin123");
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	       
	    }
	    @Test
	    public void search() {
	    	UserPage user=new  UserPage(driver);
	        user.Search("Aatmaram","ESS","Alice Duval","Enabled");
	       
	    }
	    @AfterClass
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("/HybridSeleniumCucumber/src/main/resources/ScreenShots\\orangeHRM.png");
	       
	     //   quit();
	       
	    }
	 
}
