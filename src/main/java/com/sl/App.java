package com.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    private static String DRIVER_PATH = "YOUR_CHROME_DRIVER_PATH";

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
