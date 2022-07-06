package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class BookingPage extends DriverManager {

    Actions actions = new Actions(driver);

    @FindBy(id = "accept-all-cookies-button")
    WebElement AcceptCookies;

    @FindBy(id = "find-a-booking")
    WebElement ManageBooking;


    @FindBy(id = "booking-reference-input")
    WebElement EnterReference;

    @FindBy(id = "booking-surname-input")
    WebElement EnterSurname;

    @FindBy(xpath = "//*[@id=\"find-booking-form\"]/div[3]/div[3]/drop-down-group/div[1]/div/input")
    WebElement ArrivalDate;

    @FindBy(xpath = "//*[@id=\"date-picker-day-date-picker-header\"]/button[2]")
    WebElement NextButton;

    @FindBy(id = "date-picker-day-2182022")
    WebElement SelectDate;

    @FindBy(id = "find-booking-form-button")
    WebElement Search;

    @FindBy(xpath = "//*[@id=\"pi-bookings\"]/div/div/div[2]/div/div/div[2]/div/div[3]/button[2]")
    WebElement Amendbooking;

//    @FindBy(xpath = "//*[@id=\"arrivalDate\"]")
//    WebElement UpdateArrivalDate;

    @FindBy(id = "night")
    WebElement night;

    public void clickOnManageBooking() {
        ManageBooking.click();
    }

    public void clickOnAcceptCookies() {
        AcceptCookies.click();
    }

    public void enterReference(String booking) {
        EnterReference.sendKeys(booking);
    }

    public void enterSurname(String surname) {
        EnterSurname.sendKeys(surname);
    }

    public void clickOnArrivalDate() {

        ArrivalDate.click();
    }


    public void clickOnSearch() {
        Search.submit();
    }

    public void clickOnAmendBooking() {
        Amendbooking.click();
    }

    public void clickOnUpdateArrivalDate() throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[data-test='arrival_date']")).click();
//        List<WebElement> elements = driver.findElements(By.cssSelector(".ng-isolate-scope>table>tbody>tr"));
//        int rowcount = elements.size();
//        System.out.println("Number of Rows in Calendar = " +rowcount);
//        outerloop:{
//            for (WebElement webElement : elements) {
//                List<WebElement> dates = webElement.findElements(By.cssSelector(".ng-isolate-scope>table>tbody>tr>td[id]"));
//                for (WebElement click : dates) {
//                    if (click.getText().equals("13")) {
//                        System.out.println("Selecting the Date");
//                        click.click();
//                        break outerloop;
//                    }
//                    System.out.println("End of Date Column Loop");
//                }
//            }
//            System.out.println("End of Calendar Date Selection");
//        }

//        driver.findElement(By.id("arrivalDate")).click();
//        List<WebElement> allDates = driver.findElements(By.id("pika-title-fq"));
//        for(WebElement ele:allDates){
//            String date= ele.getText();
//
//            if (date.equalsIgnoreCase("30")){
//                ele.click();
//                break;
//            }
//        }
    }


    public void clickOnNextButton() {
        NextButton.click();

    }

    public void clickOnSelectDate() {

        SelectDate.click();
    }

    public void clickOnnight() {
        night.click();
    }
}
