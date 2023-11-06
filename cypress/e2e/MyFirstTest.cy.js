describe('My First Test', () => {
    it('Test1', () => {

        cy.visit("https://kualitee_defects.kualitee.com/")
        cy.get("#email_id").type("muhammad.abdullah1@kualitatem.com")
        cy.get("#password").type("Abdy1234@")
        cy.get(".submit-btn").click()
        cy.get(".breadcrumbs").contains("Dashboard")


    })
  })