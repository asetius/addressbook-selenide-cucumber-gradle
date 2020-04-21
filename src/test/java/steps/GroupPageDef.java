package steps;

import io.cucumber.java.en.Then;
import pages.GroupPage;


public class GroupPageDef {
  GroupPage groupPage = new GroupPage();

  @Then("Create new group clicking {string} button")
  public void clickNewGroupButton(String arg0) {
   groupPage.clickNewGroupButton(arg0);
  }

  @Then("Delete existing group clicking {string} button")
  public void clickDeleteGroupButton(String arg0) {
    groupPage.clickDeleteGroupButton(arg0);
  }

  @Then("Modify existing group clicking {string} button")
  public void clickModifyGroupButton(String arg0) {
    groupPage.clickModifyGroupButton(arg0);
  }

  @Then("Select group clicking on checkbox")
  public void selectCheckbox() {
    groupPage.selectCheckbox();
  }
}
