package testVagrant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public String date1;
	public String country1;

	public String wikiCountry() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();

		try {

			driver.findElement(By.id("searchInput")).sendKeys("pushpa: the rise");
			driver.findElement(By.id("searchButton")).click();
			WebElement country = driver
					.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td"));
			country1 = country.getText();
//			System.out.println("Country: " + country.getText());

		} catch (Exception e) {

		}
		return country1;
	}

	public String wikiReleaseDate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();

		try {

			driver.findElement(By.id("searchInput")).sendKeys("pushpa: the rise");
			driver.findElement(By.id("searchButton")).click();
			WebElement date = driver
					.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"));
			date1 = date.getText();
//			System.out.println("Release date: " +date1 );

		} catch (Exception e) {

		}
		return date1;
	}

}
