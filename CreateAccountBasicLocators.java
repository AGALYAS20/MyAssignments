package xmlAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountBasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver= new ChromeDriver();
		   String generatedString = "Agalya5";
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
		   driver.findElement(By.id("numberEmployees")).sendKeys("2");
		   driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		   driver.findElement(By.className("smallSubmit")).click();
		   String pageTitle = driver.getTitle();
		   System.out.println(pageTitle);
		   boolean value = pageTitle.equals("Account Details | opentaps CRM");
		   if(value == true) {
			   System.out.println("Page title is matched");
		   }
		   driver.close();
	}

}
