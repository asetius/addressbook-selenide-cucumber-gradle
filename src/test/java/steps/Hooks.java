package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.SignInPage;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

  @Before
  public void openUrl() {
    open("http://localhost/addressbook/");
  }

  @Then("Go to group page")
  public void goToGroupPage() {
    $(By.linkText("groups")).click();
  }

  @Then("Return to group page")
  public void returnToGroupPage() {
    $(By.linkText("group page")).click();
  }
}
