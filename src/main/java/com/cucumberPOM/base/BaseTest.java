package com.cucumberPOM.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberPOM.utils.constants;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest(){
		
		prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\cucmberPOM\\config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void Initbrowser() {
		
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			else {
				System.out.println("this is not chrome");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(constants.implicitlyWait,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(constants.pageLoadTimeout,TimeUnit.SECONDS);
			
			
		}
			
		
		
	}


