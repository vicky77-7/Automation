package testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrikanTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        String username= "vicky@orikan.com";
        String password= "Vicky@123";
        String fname= "Vikesh";
        String lname="Rao";
        
		WebDriver driver = new ChromeDriver();
        driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
        driver.manage().window().maximize();
        
        
		driver.findElement(By.id("emailAddress")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lname);
		driver.findElement(By.id("addressLine1")).sendKeys("Parklane Street");
		driver.findElement(By.id("addressLine2")).sendKeys("100 Block");
		driver.findElement(By.id("postcode")).sendKeys("500087");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		WebElement state= driver.findElement(By.id("state"));
		Select dropdown = new Select(state);
		dropdown.selectByVisibleText("Queensland");
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]")).click();
		
		
		driver.findElement(By.id("cardHolderName")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@id=\"cardTypeVISA\"]")).click();
		driver.findElement(By.id("cardNumber")).sendKeys("123456789101");
		driver.findElement(By.id("cardCVV")).sendKeys("789");
		WebElement month=driver.findElement(By.id("cardExpiryMonth"));
		Select dropdown1=new Select(month);
		dropdown1.selectByVisibleText("November");
		driver.findElement(By.id("cardExpiryYear")).sendKeys("2027");
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]")).click();
		
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    driver.findElement(By.xpath("//*[@id=\"agreedToTerms\"]")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]")).click();
	    
	    
	    
	}

}
