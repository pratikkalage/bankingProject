package com.finance.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) {
		System.setProperty("webdrivr.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");

	
	}

}
