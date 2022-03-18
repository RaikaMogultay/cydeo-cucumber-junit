package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[.='Search']")
    public WebElement clickButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement header;

    @FindBy(xpath = "//img[@alt='Steve Jobs Headshot 2010-CROP (cropped 2).jpg']")
    public WebElement imageHeader;



}
