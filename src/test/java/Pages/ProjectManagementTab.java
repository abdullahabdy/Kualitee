package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProjectManagementTab {
	WebDriver driver;
	public ProjectManagementTab(WebDriver driver) {
		this.driver =driver;
	}

	public void user_logged(String email, String password) {
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email_id")).sendKeys(email);
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("password")).sendKeys(password);
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.className("submit-btn")).click();

		
	    
	}
	
	public void project_man_page() {
		
		
		driver.findElement(By.xpath("//i[contains(@class,'fa-solid fa-bars')]")).click();
	    driver.findElement(By.id("side-project-management2")).click();
		
	}

	public void click_projectmodule() {
	    

	    

		
	    
	}

	public void click_project_trainee() {
	    
	    driver.findElement(By.xpath("//*[@href=\"/projects/edit/14578\"]")).click();
	   
	}

	public void click_update_project_button() {
	    
	    driver.findElement(By.xpath("//*[contains(@href,'/projects/edit/14578')]")).click();
	    
	    

		
	    
	}

	public void update_projectname(String projectname) {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("project_name")).clear();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement pname = driver.findElement(By.id("project_name"));
		pname.clear();
		pname.sendKeys(projectname);
		pname.sendKeys(Keys.ENTER);
        

		

		
	    
	}
	public void up_project_type() throws InterruptedException {
		
		driver.findElement(By.id("project_type")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"project_type\"]/option[2]")).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		

	}
	public void up_status(){
		driver.findElement(By.id("project_status")).click();
		driver.findElement(By.xpath("//*[@id=\"project_status\"]/option[2]")).click();
		
	}
	public void clear_fields() {
	        
			
	//	driver.findElement(By.id("project_name")).clear();


		
	}
	
	public void os_update(String OS) throws InterruptedException {
		WebElement oss= driver.findElement(By.xpath("//*[contains(text(), \"Select Operating System\")]/../div/input"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        oss.click();
        oss.sendKeys(Keys.BACK_SPACE);
        oss.sendKeys(Keys.BACK_SPACE);
		oss.sendKeys(OS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class=\"ng-option ng-option-marked ng-star-inserted\"]")).click();
		oss.sendKeys(Keys.ENTER);

        

		
		
		
	}
	public void browser_update(String browser) throws InterruptedException {
		WebElement brow = driver.findElement(By.xpath("//*[contains(text(), \"Select Browser\")]/../div/input"));
		
		brow.click();
		brow.clear();
		brow.sendKeys(Keys.BACK_SPACE);
		brow.sendKeys(browser);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class=\"ng-dropdown-panel-items scroll-host\"]")).click();
		brow.sendKeys(Keys.ENTER);

		
		
	}
	public void devices_update(String device) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")).sendKeys(device);
		
		
	}

	public void clicks_on_update_btn() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//*[@class=\"submit-btn\"]")).click();
      Thread.sleep(5000);
		

        driver.findElement(By.xpath("//*[@class=\"submit-btn\"]")).click();


	}

	public void updated_successfully() {
		driver.getPageSource().contains("Success!");
		
	    
	}

	public void project_screen() {
	    
	}


	public void fields_empty() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("project_name")).clear();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement pak = driver.findElement(By.id("project_name"));
		pak.clear();
		pak.sendKeys(Keys.TAB);
		
WebElement broww = driver.findElement(By.xpath("//*[contains(text(), \"Select Browser\")]/../div/input"));
		
		broww.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		broww.clear();
		broww.sendKeys(Keys.BACK_SPACE);
		
		
	}
	public void required_fields() {
		driver.getPageSource().contains("Browsers are required");
		
	}
	public void cancel_btn() {
		
		WebElement cancel = driver.findElement(By.xpath("(//*[@class=\"submit-btn cancel\"])"));
		
		cancel.click();
	}
	public void verfy_columns() {
		
		driver.getPageSource().contains("Edit Project");
		
	}
	public void copy_project() {
		
		driver.findElement(By.xpath("(//i[contains(@class,\"fa-regular fa-clone\")])[2]")).click();
	}
	public void delete_project() {
		driver.findElement(By.xpath("(//*[@class=\"fa-solid fa-trash-can\"])[2]")).click();
	}
	public void delete_confirmation() {
		driver.findElement(By.className("submit-btn")).click();
	}
	public void cancel_delete_btn() {
		driver.findElement(By.xpath("//*[@class=\"submit-btn cancel\"]")).click();
	}
	public void mark_project() {
		driver.findElement(By.id("is_included-0")).click();
	 

	}
	public void archive_btn() {
		
		driver.findElement(By.xpath("//*[@class=\"create-project archived ng-star-inserted\"]")).click();
	}
}
		
