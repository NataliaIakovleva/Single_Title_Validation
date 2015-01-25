package core.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {

	public static void main(String[] test_data) {
		
		if (test_data.length == 0) 
		{
			System.err.println("No arguments!");
			System.exit(1);
		}

		WebDriver driver = new HtmlUnitDriver();
		String test_case_id = "01.01";
//		String url = "http://www.yandex.ru/";
//		String title_expected = "Яндекс";
		String param[] = test_data[0].split("\\|");
		
		String url = param[0];
		String title_expected = param[1];
		
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
