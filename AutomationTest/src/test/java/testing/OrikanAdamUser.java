package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.junit.Assert;



public class OrikanAdamUser {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username= "adam@orikan.com";
        String password= "Test@123";
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("emailAddress")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button")).click();
		
		String toastmsg= driver.findElement(By.className("toast-message error active")).getText();
		String msg="Email address is already registered";
		Assert.assertEquals(toastmsg, msg);
		System.out.println("TestCase passed");
        driver.quit();		

	}

}
