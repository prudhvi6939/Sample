


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.lang.model.element.Element;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestSelenium {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        // System.setProperty("webdriver.firefox.marionette","C:/Program Files/Java/geckodriver-v0.18.0-win64/geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        System.setProperty("webdriver.chrome.driver","C:/Program Files/Java/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        //String baseUrl = "https://www.google.com";
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        //String expectedTitle = "Choose an account";
        // String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        // driver.get(baseUrl);

        // get the actual value of the title
        // actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        // if (actualTitle.contentEquals(expectedTitle)){
        // System.out.println("Test Passed!");
        // } else {
        //  System.out.println("Test Failed");
        // }
        //close Fire fox
        // driver.close();
    }

}