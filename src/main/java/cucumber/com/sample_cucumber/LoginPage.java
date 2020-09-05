package cucumber.com.sample_cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selinium.base;

public class LoginPage extends base {
	@FindBy(id="email")
	private WebElement email ;
    @FindBy(id="pass")
    private WebElement pass ;
    @FindBy(id="u_0_b")
    private WebElement clickButton;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClickButton() {
		return clickButton;
	}
	public LoginPage() {
       PageFactory.initElements(driver, this);
	}

}
