package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage{

	@FindBy(linkText="Log in")
	static WebElement Link_Login;

public Homepage()
{
	PageFactory.initElements(driver, this);
}
public void clicklogin()

{
	Link_Login.click();
}
}