package org.alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pan {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\Base\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement TextBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		TextBox.click();
		WebElement prompt = driver.findElement(By.xpath("//button[contains(text(),'demonstrate ')]"));
		prompt.click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("syed");
		a.accept();
	}

}
