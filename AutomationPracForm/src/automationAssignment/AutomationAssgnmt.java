package automationAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class AutomationAssgnmt {

	public static void main(String[] args) {
		
		// this is for opening url 
		WebDriver dr = new FirefoxDriver();
		dr.get("http://toolsqa.com/automation-practice-form/");
		
		//for maximising windows
		dr.manage().window().maximize();
		
		//for entering firstname and lastname
		dr.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Umang");
		dr.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Sharma");
		
		// selecting gender
		dr.findElement(By.xpath(".//*[@id='sex-0']")).click();
		
		// selecting years of experience
		 dr.findElement(By.xpath(".//*[@id='exp-5']")).click();
		 
		 //entering date
		 dr.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("23-Nov-2018");
		 
		 //profession
		 dr.findElement(By.xpath(".//*[@id='profession-1']")).click();
		
		 
		 
		 //uploading file
		 dr.findElement(By.xpath(".//*[@id='photo']")).sendKeys("‪C://Users//User//Desktop//abc.jpg");
		 
		 dr.findElement(By.xpath(".//*[@id='photo']")).sendKeys("C:\\Users\\User\\Desktop\\abc.jpg");
		 
		 //selecting automation tool
		 dr.findElement(By.xpath(".//*[@id='tool-2']")).click();
		 
		 //selecting continents 
		 Select s1 = new Select(dr.findElement(By.xpath(".//*[@id='continents']")));
		 s1.selectByIndex(6);
		 
		 
		 // selenium commands - multiselect
		 Select s2 = new Select(dr.findElement(By.xpath(".//*[@id='selenium_commands']")));

		 s2.selectByVisibleText("WebElement Commands");
		 s2.selectByVisibleText("Wait Commands");
		 
		// System.out.println(" this is the end");
		 
		 dr.findElement(By.xpath(".//*[@id='submit']")).click();
		 
		 dr.navigate().to("www.gmail.com");
		 
		 dr.navigate().back();
		 
		 
		
		 
		 
	}

}
