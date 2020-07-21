package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDayCombo  = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayBoard = new Select(selectDayCombo);
        selectDayBoard.selectByIndex(10);

        WebElement selectMonthCombo  = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthBoard = new Select(selectMonthCombo);
        selectMonthBoard.selectByIndex(3);

        WebElement selectYearCombo  = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearBoard = new Select(selectYearCombo);
        selectYearBoard.selectByIndex(2018);
    }
}
