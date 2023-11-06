import 'cypress-xpath';

// ... other commands


class ProjectManagement {
    constructor() {
        this.txtUrl = "https://kualitee_defects.kualitee.com/";
        this.txtEmail = "#email_id";
        this.txtPassword = "#password";
        this.txtLoginBtn = ".submit-btn";
        this.txtdashboard = "//i[contains(@class,'fa-solid fa-bars')]";
        this.txtprojectManTab = "#side-project-management2";
        this.txtclickproject = "//a[@href='/projects/detail/14602']";
        this.txtclick_update_project = "(//a[@class='submit-btn ng-star-inserted'])[2]";
        this.txtproject_name = "#project_name";
        this.txtproject_type = "#project_type";
        this.txtupdate_OS = "//*[@class='ng-value-container' and contains(., 'Select Operating System')]";
        this.txtupdate_device = "//*[@class='ng-value-container' and contains(., 'Devices')]";
        this.txt_select_device = "//div[@role='option']";
        this.txt_update_browser = "//*[@class='ng-value-container' and contains(., 'Browser')]";
        this.txt_select_browser = "//div[@role='option']";
        this.txt_cancel_btn = "//input[@type='button']";
        this.txt_verification_project_not_updated = "//*[@class='ng-star-inserted']//a[@href='/projects/detail/14602']";
        this.txt_verify_projects_page = ".breadcrumbs";
        this.txt_assertion_data1 = "Project1";
        this.txt_assertion_data2 = "Projects";
        this.txt_update_btn = "//*[@class='form-buttons clearfix']/button";
        this.txt_error_for_special_charac = "//div[@class='invalid-feedback ng-star-inserted']/div";
        this.txt_assertion_data3 = "Project Name is required";
        this.txt_assertion_data4 = "Projects";
        this.txt_search_bar = "[type='search']";
        this.txt_search_bar_verification = "//*[@class='ng-star-inserted']/tr[contains(., 'Project1')]";
      }


    visit() {
      cy.visit(this.txtUrl);
    }
  
    fillEmail(email) {
      cy.get(this.txtEmail).type(email);
    }
  
    fillPassword(password) {
      cy.get(this.txtPassword).type(password);
    }
  
    clickLoginButton() {
      cy.get(this.txtLoginBtn).click();
    }
    clickDashborad(){
        cy.xpath(this.txtdashboard).click({ force: true });
    }
    clickProjectManagementTab(){
        cy.get(this.txtprojectManTab).click({ force: true });
    }
    clickProject(){
        cy.xpath(this.txtclickproject).click({force: true});
    }
    clickUpdateProject(){
        cy.xpath(this.txtclick_update_project).click();
    }
    updateProjectName(projectname){
        cy.get(this.txtproject_name).clear().type('@##$$#$')
    }
    updateProjectType(projecttype){
        cy.get(this.txtproject_type).select(projecttype);
    }
    updateOS(OS){
        cy.xpath(this.txtupdate_OS)
        .type('{backspace}')
        .type(OS)
        .type('{enter}')
    }
    updateDevice(device){
        cy.xpath(this.txtupdate_device)
        .type('{backspace}')
        .type(device)
        cy.xpath(this.txt_select_device).click()
    }
    updateBrowser(browser){
        cy.xpath(this.txt_update_browser)
        .type('{selectall}{backspace}')
        .type(browser)
        cy.xpath(this.txt_select_browser).click()

    }
    updateStatus(status){
    }
    cancelbtn(){
        cy.xpath(this.txt_cancel_btn).click()
    }
    Verification_cancel_btn(){
        cy.xpath(this.txt_verification_project_not_updated).contains(this.txt_assertion_data1)
        cy.get(this.txt_verify_projects_page).contains(this.txt_assertion_data2)
       
    }
    update_btn(){
        cy.xpath(this.txt_update_btn).click();
    }
    screen_not_support_specialcharac_verification(){
        cy.xpath(this.txt_error_for_special_charac).contains(this.txt_assertion_data3);
    }
    project_screen_column_verification(){
        cy.get(this.txt_verify_projects_page).contains(this.txt_assertion_data4);

    }
    search_bar(queryy) {
        cy.get(this.txt_search_bar).clear().type(queryy);
    }
    search_bar_verification_by_project_name() {
        cy.xpath(this.txt_search_bar_verification).should('be.visible');

    }
  
  }
  
  export default ProjectManagement;
  