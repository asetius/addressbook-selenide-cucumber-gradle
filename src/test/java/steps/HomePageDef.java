package steps;

import io.cucumber.java.en.Then;
import pages.HomePage;


public class HomePageDef {
  HomePage homePage = new HomePage();

  @Then("Content with {string} visible")
  public void contentWithVisible(String arg0) {
    homePage.contentIsVisible(arg0);
  }
}
