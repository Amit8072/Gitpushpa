package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Pushpa_wiki extends Baseclass {

	@Test
	public void wiki()
	{
		 driver.get("https://www.google.com/");
		 WebElement Pushpa_wiki=driver.findElement(By.name("q"));
		 Pushpa_wiki.sendKeys("Pushpa the rise");
		 Pushpa_wiki.submit();
		driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Wikipedia']")).click();
		
		//Release date of Pushpa(Wiki)
		String Release_date_wiki=driver.findElement(By.xpath("//tr[12]//td//div//li")).getText();
		System.out.println("Relase Date wiki :"+Release_date_wiki);
		
		String Expected_date="17 December 2021";
		if(Release_date_wiki.equals(Expected_date))
		{
			System.out.println("Test Case Is Pass : "+Release_date_wiki);
		}
		else
		{
			System.out.println("Test Case is Failed :"+Release_date_wiki);
		}
		
		//Country India(Wiki)
		String Country_wiki=driver.findElement(By.xpath("//td[text()='India']")).getText();
		System.out.println("Country Wiki :"+Country_wiki);
		String Expected_country="India";
		if(Country_wiki.equals(Expected_country))
		{
			System.out.println("Test Case Is Pass : "+Country_wiki);
		}
		else
		{
			System.out.println("Test Case is Failed :  "+Country_wiki);
		}	 
	}
}
