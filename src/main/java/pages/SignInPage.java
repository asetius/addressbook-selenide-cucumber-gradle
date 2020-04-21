package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
  private SelenideElement loginInput = $(By.name("user"));
  private SelenideElement passwordInput = $(By.name("pass"));

  public void inputLogin(String text) {
    this.loginInput.val(text);
  }

  public void inputPassword(String text) {
    this.passwordInput.val(text);
  }

  public void clickLoginButton(String text) {
    $(By.xpath("//input[@value='" + text + "']")).click();
  }
}
