package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition {
	
	WebDriver driver;

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Then("user opens url as {string}")
	public void user_opens_url_as(String TestURL) {
		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("user enters username as {string} and password as {string} and click loginbtn")
	public void user_enters_username_as_and_password_as_and_click_loginbtn(String string, String string2) throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("user clicks admin dashboard")
	public void user_clicks_admin_dashboard() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		    Thread.sleep(3000);
	}

	@Then("click qualification dropdown and click skills option then click add btn")
	public void click_qualification_dropdown_and_click_skills_option_then_click_add_btn() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Skills']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);

	}

	@Then("user enters skillname as {string} and skill description as {string} and click save btn")
	public void user_enters_skillname_as_and_skill_description_as_and_click_save_btn(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(string);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(string2);
		Thread.sleep(2000);   
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}

	@Then("logout")
	public void logout() {

	}

	@Then("close browser")
	public void close_browser() {

	}
	
	
	
	@And("user clicks  admin dashboard1")
	
	public void user_clicks_admin_dashboard1() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		    Thread.sleep(3000);
		
	}

	@Then("click Nationalities option and then click add button")
	public void click_nationalities_option_and_then_click_add_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		 Thread.sleep(2000);
	}

	@Then("user enters the name as  {string} and click save button")
	public void user_enters_the_name_as_and_click_save_button(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(string);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}

	@Then("click job dropdown and Job Titles option and then  click add btn")
	public void click_job_dropdown_and_job_titles_option_and_then_click_add_btn() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();	
	}

	@Then("user enters jobname as {string} and enter job description as {string} and enter note as {string} and click save btn")
	public void user_enters_jobname_as_and_enter_job_description_as_and_enter_note_as_and_click_save_btn(String string,
			String string2, String string3) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(string);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(string2);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(string3);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		
	}

}
