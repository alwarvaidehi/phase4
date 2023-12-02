package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage{
	//http://demowebshop.tricentis.com/

@FindBy(id="Email")
static WebElement Tricentis_Username;

@FindBy(id="Password")
static WebElement Tricentis_Password;

@FindBy(xpath="//input[@value='Log in']")
static WebElement Tricentis_loginBtn;

@FindBy(linkText="Log out")
static WebElement Tricentis_logoutbtn;

public void enterloginDetails(String u,String p)
{
	Tricentis_Username.sendKeys(u);
	Tricentis_Password.sendKeys(p);
	Tricentis_loginBtn.click();
}
public void clicklogout()
{
	Tricentis_logoutbtn.click();
}
public Loginpage()
{
	PageFactory.initElements(driver, this);
}

}