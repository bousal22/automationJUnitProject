package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
	WebDriver driver;

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

//  WebElement checkbox = driver.findElement(null)

	@FindBy(how = How.CSS, using = "input[name=\"allbox\"]")
	WebElement CHECKBOX_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[4]")
	WebElement SINGLE_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=Remove]")
	WebElement REMOVE_ELEMENT;

	public void validateCheckboxSelection() {
		CHECKBOX_ELEMENT.click();
	}

	public void selectSingleItem() {
		SINGLE_ITEM_ELEMENT.click();

	}

	public void removeSingleItem() {
		REMOVE_ELEMENT.click();

	}
}
