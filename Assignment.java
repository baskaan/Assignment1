package testVagrant;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public String date;
	public String country;

	public String imdbCountry() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();

		try {

			driver.findElement(By.id("suggestion-search")).sendKeys("pushpa");
			driver.findElement(By.id("iconContext-magnify")).click();

			List<WebElement> list1 = driver.findElements(By.tagName("a"));
			for (WebElement webElement : list1) {

				if (webElement.getText().equals("Pushpa: The Rise - Part 1")) {
					webElement.click();
					country = driver.findElement(By.xpath(
							"//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a"))
							.getText();
					System.out.println("Country: " + country);
					
				}
			}
		} catch (Exception e) {

		}
		return country;
	}

	public String imbdReleaseDate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();

		try {

			driver.findElement(By.id("suggestion-search")).sendKeys("pushpa");
			driver.findElement(By.id("iconContext-magnify")).click();

			List<WebElement> list1 = driver.findElements(By.tagName("a"));
			for (WebElement webElement : list1) {

				if (webElement.getText().equals("Pushpa: The Rise - Part 1")) {
					webElement.click();
					String a = driver.findElement(By.xpath(
							"//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/div/ul/li/a"))
							.getText();
					date = a.substring(0, 15);
//					System.out.println("Release date: " + date);
				}
			}
		} catch (Exception e) {

		}
		return date;

	}

}
