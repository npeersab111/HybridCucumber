package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class UserPage extends Library {
		  @FindBy(id="searchSystemUser_userName")
		    WebElement username;
		    @FindBy(xpath="//*[@id=\"searchSystemUser_userType\"]/option[3]")
		    WebElement role;
		    @FindBy(xpath="//*[@id=\"searchSystemUser_employeeName_empName\"]")
		    WebElement name;
		    @FindBy(xpath="//*[@id=\"searchSystemUser_status\"]/option[2]")
		    WebElement status;
		    
		    @FindBy(xpath="//*[@id=\"searchBtn\"]")
		    WebElement  searchbutton;
		    
		    public UserPage(WebDriver driver) {
		        this.driver=driver;
		        PageFactory.initElements(driver, this);
		        
		        
		}
		    
		    public void Search(String uname,String rol,String Ename,String stat) {
		        username.sendKeys(uname);
		        role.sendKeys(rol);
		        name.sendKeys(Ename);
		        status.sendKeys(stat);
		        
		        searchbutton.click();
		        
		    }
		 
	}


