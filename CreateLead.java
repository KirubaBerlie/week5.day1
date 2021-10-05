package week5.day1.assignments;


import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateLead extends SuperClass {

	@Test
	public void runCreateLead() {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Berlie");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

	}

}
