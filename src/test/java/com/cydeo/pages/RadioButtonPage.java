package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage {



    @FindBy(xpath = "//label[.='Hockey']/../input")
    public WebElement radioButtonForHockey;






}
