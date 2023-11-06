import ProjectManagement from '../POM/ProjectManagement.js';
// import MyData from 'C:\Users\Muhammad Abdullah\Cypress-auto\cypress\fixtures\MyData.json'

const ktm = new ProjectManagement()
let fixtureData;

describe('Project Management Functionality', () => {
    before(() => {
        cy.fixture('MyData').then((data) => {
          fixtureData = data;
        });
      });
   
  beforeEach(() => {
    
  
    ktm.visit();
    ktm.fillEmail(fixtureData.email);
    ktm.fillPassword(fixtureData.password);
    ktm.clickLoginButton();
    ktm.clickDashborad();
    ktm.clickProjectManagementTab();
  });

  it('TestCase(9):Verify Cancel Button Functionality on the Edit Project Screen', () => {
    ktm.clickProject();
    ktm.clickUpdateProject();
    ktm.updateProjectName(fixtureData.project_name);
    ktm.updateProjectType(fixtureData.project_type);
    ktm.updateOS(fixtureData.OS);
    ktm.updateDevice(fixtureData.device);
    ktm.updateBrowser(fixtureData.browser); 
    ktm.updateStatus(fixtureData.status)
    ktm.cancelbtn();
    

  });
  it('TestCase(10):Verify Cancel Button Functionality on the Edit Project Screen', () => {

    ktm.clickProject();
    ktm.clickUpdateProject();
    ktm.updateProjectName(fixtureData.special_Character_Name);
    ktm.updateProjectType(fixtureData.project_type);
    ktm.updateOS(fixtureData.OS);
    ktm.updateDevice(fixtureData.device);
    ktm.updateBrowser(fixtureData.browser); 
    ktm.updateStatus(fixtureData.status);
    ktm.update_btn();
    ktm.screen_not_support_specialcharac_verification();
    

});
it('TestCase(11):Verify that all the columns are displayed for the project tab', () => {


    ktm.project_screen_column_verification();
   

});

it('TestCase(12):Verify the searchBar Functionality', () => {

    ktm.search_bar(fixtureData.project_name);
    ktm.search_bar_verification_by_project_name();
    ktm.search_bar(fixtureData.creator);
    ktm.search_bar_verification_by_project_name();
    ktm.search_bar(fixtureData.date);
    ktm.search_bar_verification_by_project_name();
    ktm.search_bar(fixtureData.statuss);
    ktm.search_bar_verification_by_project_name();





   

});

})
