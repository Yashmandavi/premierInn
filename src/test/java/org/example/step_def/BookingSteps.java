package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;

import org.example.pages.BookingPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.StringContains.containsString;

public class BookingSteps extends DriverManager {

    DriverManager driverManager = new DriverManager();
    BookingPage homePage = new BookingPage();

    @Given("^I am on the Home page$")
    public void i_am_on_the_home_page() {

//        validation through url
        String actualUrl = driverManager.getUrl();
        System.out.println(actualUrl);
        assertThat(actualUrl, is(endsWith("https://www.premierinn.com/gb/en/home.html")));
    }


    @When("^I Click on the \"([^\"]*)\"$")
    public void i_click_on_the(String headerName) throws Throwable {
        switch (headerName) {
            case "Accept cookies":
                homePage.clickOnAcceptCookies();
                break;
            case "manage booking":
                homePage.clickOnManageBooking();
                break;
            case "Arrival Date":
                homePage.clickOnArrivalDate();
                break;
            case "Next Button":
                homePage.clickOnNextButton();
                break;
            case "Select Date":
                homePage.clickOnSelectDate();
                break;
            case "Search":
                homePage.clickOnSearch();
                break;
            case "Amend Booking":
                homePage.clickOnAmendBooking();
                break;
            case "Update Arrival Date":
                homePage.clickOnUpdateArrivalDate();
                break;
            case "night":
                homePage.clickOnnight();
                break;

        }
    }

    @And("^I enter reference \"([^\"]*)\"$")
    public void iEnterReference(String booking) {
        homePage.enterReference(booking);
    }

    @And("^I enter surname \"([^\"]*)\"$")
    public void iEnterSurname(String surname) {

        homePage.enterSurname(surname);
    }
}
