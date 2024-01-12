package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//register the web driver =>browser vendor 
        WebDriverManager.chromedriver().setup();
        //creating an object to the object
        WebDriver wd=new ChromeDriver();
        //maximize the browser
        wd.manage().window().maximize();
        
        //go to browser and open this url 
        wd.get("https://www.amazon.in/");
        
        //supply any data
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirt");
        //nav-search-submit-button
        wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	
      //on a page if we need a delay to pause 
        Thread.sleep(2000);

        //close browser
        wd.close();

    }
}
