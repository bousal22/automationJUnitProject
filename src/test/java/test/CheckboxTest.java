package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import util.BrowserFactory;

public class CheckboxTest {

	WebDriver driver;

	@Test
	public void LaunchTheMainPage() throws InterruptedException {

		driver = BrowserFactory.init();
		Thread.sleep(2000);
		
		CheckBoxPage checkboxpage = PageFactory.initElements(driver, CheckBoxPage.class);
        checkboxpage.validateCheckboxSelection();
        driver.findElement(By.xpath("input[name=\"allbox\"]")).isSelected();
        
		Thread.sleep(2000);
        checkboxpage.validateCheckboxSelection();

		Thread.sleep(2000);
		checkboxpage.selectSingleItem();
		
		Thread.sleep(2000);
//		checkboxpage.removeSingleItem();

		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}

}
