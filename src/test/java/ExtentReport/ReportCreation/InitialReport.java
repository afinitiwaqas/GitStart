package ExtentReport.ReportCreation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InitialReport   {
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		//ExtentReports, ExtentSparkReporter
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Reporting Automation Report");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("SDET Name", "Waqas Munawar");
	}
	
	@Test
	public void firstReport()
	{
		
		extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\waqas.munawar.AFINITI\\Desktop\\Udemy Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();	
		driver.get("https://auth.megasbox2.com/auth/login?redirectTo=/&redirectAs=/");
		 System.out.println(driver.getTitle());
		 extent.flush();
		
	}
}
