package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GroupFormPage {
  private SelenideElement groupNameInput = $(By.name("group_name"));
  private SelenideElement groupHeaderInput = $(By.name("group_header"));
  private SelenideElement groupFooterInput = $(By.name("group_footer"));


  public void inputGroupName(String text) {
    this.groupNameInput.val(text);
  }

  public void inputGroupHeader(String text) {
    this.groupHeaderInput.val(text);
  }

  public void inputGroupFooter(String text) {
    this.groupFooterInput.val(text);
  }

  public void modifyGroupName(String text) {
    this.groupNameInput.val(text);
  }

  public void modifyGroupHeader(String text) {
    this.groupHeaderInput.val(text);
  }

  public void modifyGroupFooter(String text) {
    this.groupFooterInput.val(text);
  }

  public void clickSubmitButton(String text) {
    $(By.xpath("//input[@value='" + text + "']")).click();
  }

  public void clickUpdateButton(String text) {
    $(By.xpath("//input[@value='" + text + "']")).click();
  }

}
