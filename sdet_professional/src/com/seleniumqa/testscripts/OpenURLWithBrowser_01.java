package com.seleniumqa.testscripts;


	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.chrome.ChromeDriver;  
	
	public class OpenURLWithBrowser_01 { 
	    public static void main(String[] args) {  
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hey\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();  
	        driver.get(" https://opensource-demo.orangehrmlive.com/");


       driver.manage().window().maximize(); 
       

    }  

  } 
