package testVagrant;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		Assignment a1 = new Assignment();
		Assignment2 a2 = new Assignment2();
		Assert.assertEquals(a1.imdbCountry(), a2.wikiCountry());

	}

	@Test
	public void f2() throws ParseException {
		Assignment a3 = new Assignment();
		Assignment2 a4 = new Assignment2();
		String date11 = a3.imbdReleaseDate();
		String date12 = a4.wikiReleaseDate();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(date11, formatter); 
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH);
		LocalDate date1 = LocalDate.parse(date12, formatter1);
		
		if(date.equals(date1)) {
			System.out.println("Both the dates are same");
		}
		else {
			System.out.println("Both the dates are different");
		}
		

	}
}
