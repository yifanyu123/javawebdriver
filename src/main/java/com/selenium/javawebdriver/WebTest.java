package com.selenium.javawebdriver;

import java.lang.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class WebTest {
    //the web url to test
    private static String url="http://localhost:8080/";
    public static void main(String args[]){
        String prj_path="/Users/yuyifan/OneDrive/YYF/Coding/Java/Java-WorkSpace/selenium_java";
        String chrome_driver=prj_path+"/tools/chromedriver";

        System.out.println("Welcome to the hello friend web test");

        //Optional:finding the chrome driver location
        System.setProperty("webdriver.chrome.driver",chrome_driver);
        //Create a new webdriver
        WebDriver driver=new ChromeDriver();
        //open up the specified weburl
        driver.get(WebTest.url);

        //connect
        connect(driver);
        //quit
        driver.quit();

    }

    public void connect(WebDriver dr){
        //find the connect button id
        WebElement connect_btn=dr.findElement(By.id("connect"));
        //click the connect button
        connect_btn.click();


    }
    public void join(String roomName,String userN, String userLang){

    }

    public create(WebDriver dr){}
}
