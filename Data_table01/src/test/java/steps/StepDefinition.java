package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	
	LoginPage LP;
	
	JobsPage JP;
	
	HomePage HP;

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Then("user opens url as {string}")
	public void user_opens_url_as(String URL) {

		LP = new LoginPage();
		LP.LoginPage(driver);
		LP.user_opens_url_as(URL);

	}

	@Then("user should enters login credentials")
	public void user_should_enters_login_credentials(io.cucumber.datatable.DataTable dataTable) throws Throwable {

		LP.LoginPage(driver);
		LP.user_should_enters_login_credentials(dataTable);
		
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		
		LP.LoginPage(driver);
		LP.user_clicks_login_button();

	}

	@Then("user clicks admin dashboard")
	public void user_clicks_admin_dashboard() throws Throwable {
		
		JP = new JobsPage();
		JP.JobsPage(driver);
		JP.user_clicks_admin_dashboard();
	}

	@Then("click job dropdown and  select Job Titles option then click add button")
	public void click_job_dropdown_and_select_job_titles_option_then_click_add_button() throws Throwable {

		JP.JobsPage(driver);
		JP.click_job_dropdown_and_select_job_titles_option_then_click_add_button();
	}

	@Then("user enters job details")
	public void user_enters_job_details(io.cucumber.datatable.DataTable dataTable) throws Throwable {

		JP.JobsPage(driver);
		JP.user_enters_job_details(dataTable);
	}

	@Then("user click save button")
	public void user_click_save_button() {
		

	}

	@Then("logout")
	public void logout() {
		HP = new HomePage();
		HP.HomePage(driver);
		HP.logout();

	}

	@Then("close browser")
	public void close_browser() {
		
		HP.HomePage(driver);
		HP.close_browser();

	}

}
