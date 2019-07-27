package AutomationFormPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Classfile {

	public static void main(String[] args) {
		
		WebDriver dr = new FirefoxDriver();
		//this is for opening a url
		dr.get("http://toolsqa.com/automation-practice-form/");
		
	    //for entering first name
	    dr.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Sharma");
	    
	    //for entering last name
	    dr.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Umang");
	    
	    //for selecting gender
	    dr.findElement(By.xpath(".//*[@id='sex-0']")).click();
	    
	    //for selecting years of experience
	    dr.findElement(By.xpath(".//*[@id='exp-5']")).click();
	    
	    //for selecting checkbox -- profession type
	    dr.findElement(By.xpath(".//*[@id='profession-1']")).click();
	    
	    //for entering date
	    dr.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("23-Nov-2018");
	    
	    //
	    
	    
	    
	    
	    
	    
	}

}
