package part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
	List<WebElement> elements = driver.findElements(By.xpath("//button"));
	
	for (WebElement element : elements) {  //retrive each webelement
		
		System.out.print(element.getText());
	}
	//driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
