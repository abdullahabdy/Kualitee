package KuaiteeStepsDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.ProjectManagementTab;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProjectFunctionality {
	WebDriver driver;
	ProjectManagementTab KTM;
	
	@Given("user is on login page of KTM")
	public void user_is_on_login_page_of_ktm(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Muhammad Abdullah\\eclipse-workspace\\KualiteeSite\\src\\test\\resources\\Drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    KTM=new ProjectManagementTab(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://kualitee_defects.kualitee.com/");}

	@Given("user logged in")
	public void user_logged_in() {
		
	    KTM.user_logged("muhammad.abdullah1@kualitatem.com", "Abdy1234@");
	}


	@And("click on project module")
	public void click_on_project_module() throws InterruptedException {
		Thread.sleep(10000);
		KTM.project_man_page();
	    
	}

	@And("click on project trainee")
	public void click_on_project_trainee() throws InterruptedException {
		Thread.sleep(5000);
		KTM.click_project_trainee();
	    
	}

	@And("click on update project button")
	public void click_on_update_project_button() {
		System.out.print("Pencil Removed");
		//KTM.click_update_project_button();
	    
	}

	@And("enter data in mandatory fields")
	public void enter_data_in_mandatory_fields() throws InterruptedException {
		
		//KTM.clear_fields();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.update_projectname("Project1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.up_project_type();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.up_status();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.os_update("Windows 11");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//KTM.devices_update("iphone");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		KTM.browser_update("chrome17");
	    
	}

	@When("user clicks on update btn")
	public void user_clicks_on_update_btn() throws InterruptedException{
		
		   Thread.sleep(7000);
       KTM.clicks_on_update_btn();
	
	       

	}

	@Then("updated successfully pop will appear")
	public void updated_successfully_pop_will_appear() {
		
		KTM.updated_successfully();
		
	    
	}

	@And("redirected to the project screen")
	public void redirected_to_the_project_screen() throws InterruptedException {
		KTM.click_project_trainee();
		Thread.sleep(2000);
		
	    
	}
	
	@Given("Make mandatory fields null")
	public void make_mandatory_fields_null() throws InterruptedException {
		Thread.sleep(5000);

	    KTM.fields_empty();
	}

	@Then("Required line will display")
	public void required_line_will_display() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		KTM.required_fields();
	}
	@And("user clicks on cancel")
	public void user_clicks_on_cancel() throws InterruptedException {
		Thread.sleep(5000);
	    KTM.cancel_btn();
	}
	@And("Make mandatory fields Special Characters")
	public void make_mandatory_fields_special_characters() throws InterruptedException {
		//KTM.clear_fields();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.update_projectname("@#$#$%$#$");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.up_project_type();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.up_status();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.os_update("Windows 11");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//KTM.devices_update("iphone");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		KTM.browser_update("chrome17");
	    
	    
	}
	@Then("Verify all the columns")
	public void verify_all_the_columns() {
	    KTM.verfy_columns();
	}
	@And("click on copy")
	public void click_on_copy() {
	    KTM.copy_project();
	}
	@Given("click on delete")
	public void click_on_delete() {
	   KTM.delete_project();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       KTM.delete_confirmation();

	}
	@Given("click on cancel")
	public void click_on_cancel() {
		KTM.cancel_delete_btn();
	   
	}
	@Given("click on delete function")
	public void click_on_delete_function() throws InterruptedException {
		Thread.sleep(5000);
	    KTM.delete_project();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    KTM.cancel_delete_btn();

	}
	@Given("mark_projects")
	public void mark_projects() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.mark_project();
	   
	}

	@Then("click on archive button")
	public void click_on_archive_button() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		KTM.archive_btn();
	  
	}










}
