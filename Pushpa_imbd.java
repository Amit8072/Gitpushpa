package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Pushpa_imbd extends Baseclass {

	@Test
	public void Imbd()
	{
		 driver.get("https://www.google.com/");
		 WebElement Pushpa_imbd=driver.findElement(By.name("q"));
		 Pushpa_imbd.sendKeys("Pushpa the rise");
		 Pushpa_imbd.submit();
		 driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Part 1 (2021) - IMDb']")).click();
		 
		//Release Date Of pushpa(IMBD)
		 String Release_date_imbd=driver.findElement(By.xpath("//a[text()='December 17, 2021 (India)']")).getText();
		 System.out.println("Relase Date Imbd :"+Release_date_imbd);
		 
		 String Expected_date_imbd="December 17, 2021 (India)";
			if(Release_date_imbd.equals(Expected_date_imbd))
			{
				System.out.println("Test Case Is Pass : "+Release_date_imbd);
			}
			else
			{
				System.out.println("Test Case is Failed :"+Release_date_imbd);
			}
			
			//Country India(IMBD)
			String Country_imbd=driver.findElement(By.xpath("//a[text()='India']")).getText();
			System.out.println("Country Wiki :"+Country_imbd);
			String Expected_country_imbd="India";
			if(Country_imbd.equals(Expected_country_imbd))
			{
				System.out.println("Test Case Is Pass : "+Country_imbd);
			}
			else
			{
				System.out.println("Test Case is Failed :  "+Country_imbd);
			}	 
			
		 
		 
	}
}
