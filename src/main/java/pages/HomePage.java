package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

  public void contentIsVisible(String text) {
    $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
  }

}
