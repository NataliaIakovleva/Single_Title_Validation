package core.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new HtmlUnitDriver();
		String test_case_id = "01.01";
		String url = "http://www.yandex.ru/";
		String title_expected = "Яндекс";
		
		driver.get(url);
		if (title_expected.equals(driver.getTitle()))
		{
			System.out.println("Test Case ID: " + test_case_id + "\t PASSED");			
		}
		else 
		{
			System.out.println("Test Case ID: " + test_case_id + "\t FAILED");	
		}
	}

}
