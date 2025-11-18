package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public void LoginPage(WebDriver driver) {
		
		this.driver =driver;
		
	}

	public void user_opens_url_as(String URL) {

		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void user_should_enters_login_credentials(io.cucumber.datatable.DataTable dataTable) throws Throwable {

		String username = dataTable.cell(0, 0);

		String password = dataTable.cell(0, 1);

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	public void user_clicks_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
