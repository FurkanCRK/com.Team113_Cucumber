package pages;

import io.cucumber.java.zh_cn.假如;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {
    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='New']")
    public WebElement newButton;

    @FindBy (xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameBox;

    @FindBy (xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='sorting_1']")
    public WebElement ilkElement;




}
