package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage {

	WebDriver driver;

	public void JobsPage(WebDriver driver) {

		this.driver = driver;

	}

	public void user_clicks_admin_dashboard() throws Throwable {

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
	}

	public void click_job_dropdown_and_select_job_titles_option_then_click_add_button() throws Throwable {

		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		Thread.sleep(2000);

	}

	public void user_enters_job_details(io.cucumber.datatable.DataTable dataTable) throws Throwable {

		List<List<String>> jobrecord = dataTable.cells();

		for (int i = 0; i < 4; i++) { // i=0<4=true,i=0+1=1<4=true....3+1=4<4===false

			String jobtitle = jobrecord.get(i).get(0); // 3,0
			String jobdescr = jobrecord.get(i).get(1); // 3,1
			String jobnote = jobrecord.get(i).get(2); // 3,2

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(jobtitle);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(jobdescr);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(jobnote);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
		}
	}

}
