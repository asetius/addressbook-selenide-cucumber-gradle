package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GroupPage {

  public void clickNewGroupButton(String text) {
    $(By.xpath("//input[@value='" + text + "']")).click();
  }

  public void clickDeleteGroupButton(String text) {
    $(By.xpath("//input[@value='" + text + "']")).click();
  }

  public void clickModifyGroupButton(String text) {
    $(By.xpath("//input[@value='" + text + "']")).click();
  }

  public void selectCheckbox() {
    $(By.name("selected[]")).click();
  }
}
