package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.xpath("//button[@value=\\\"LogIn\\\"]"));
		System.out.print(element.getText());
		
		// TODO Auto-generated method stub

	}

}
