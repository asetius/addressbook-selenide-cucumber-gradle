package steps;

import io.cucumber.java.en.Then;
import pages.GroupFormPage;


public class GroupFormPageDef {
  GroupFormPage groupFormPage = new GroupFormPage();

  @Then("Input group name")
  public void inputGroupName() {
    groupFormPage.inputGroupName("name1");
  }

  @Then("Input group header")
  public void inputGroupHeader() {
    groupFormPage.inputGroupHeader("header1");
  }

  @Then("Input group footer")
  public void inputGroupFooter() {
    groupFormPage.inputGroupFooter("footer1");
  }

  @Then("Modify group name")
  public void modifyGroupName() {
    groupFormPage.modifyGroupName("new name");
  }

  @Then("Modify group header")
  public void modifyGroupHeader() {
    groupFormPage.modifyGroupHeader("new header");
  }

  @Then("Modify group footer")
  public void modifyGroupFooter() {
    groupFormPage.modifyGroupFooter("new footer");
  }

  @Then("Submit group creation clicking {string} button")
  public void clickSubmitButton(String arg0) {
    groupFormPage.clickSubmitButton(arg0);
  }

  @Then("Update group modification clicking {string} button")
  public void clickUpdateButton(String arg0) {
    groupFormPage.clickUpdateButton(arg0);
  }

}
