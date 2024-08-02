package xmlAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   ChromeDriver driver= new ChromeDriver();
   String generatedString = "aga19";
   driver.get("http://leaftaps.com/opentaps/");
   driver.manage().window().maximize();
   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   driver.findElement(By.className("decorativeSubmit")).click();
   driver.findElement(By.id("button")).click();
   driver.findElement(By.linkText("Accounts")).click();
   driver.findElement(By.xpath("//a[@href='/crmsfa/control/createAccountForm']")).click();
   driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(generatedString);
   driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
   Select options = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
   options.selectByValue("IND_SOFTWARE");
   options = new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
   options.selectByVisibleText("S-Corporation");
   options= new Select(driver.findElement(By.id("dataSourceId")));
   options.selectByValue("LEAD_EMPLOYEE");
   options= new Select(driver.findElement(By.id("marketingCampaignId")));
   options.selectByIndex(5);
   options = new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
   options.selectByValue("TX");
   driver.findElement(By.className("smallSubmit")).click();
   WebElement element = driver.findElement(By.xpath("//span[text()='Account Name']/../../td[2]/span"));
   String text = element.getText();
   System.out.println("text "+text);
   Thread.sleep(3000);
   //driver.close();
   
	}

}
