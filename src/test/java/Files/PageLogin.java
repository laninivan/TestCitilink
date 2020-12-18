package Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.charset.StandardCharsets;

public class PageLogin {

    public WebDriver driver;

    public PageLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(className = "AuthPopup")
    private WebElement loginBtn;
    @FindBy(className = "SignIn__actions")
    private WebElement loginBtn2;
    @FindBy(name = "login")
    private WebElement loginField;
    @FindBy(name = "pass")
    private WebElement passwdField;
    @FindBy(className = "HeaderUserName")
    private WebElement userMenu;


    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }


    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }


    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickLoginBtn2() {
        loginBtn2.click();
    }

    public String getUserName() {
        return new String(userMenu.getText().getBytes(StandardCharsets.UTF_8));
    }
}
