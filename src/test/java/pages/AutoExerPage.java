package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExerPage {
    public AutoExerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//*[@*='signup-name']")
    public WebElement signUpNameKutusu;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signUpEmailKutusu;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement mrButonu;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailKutusu;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordKutusu;

    @FindBy (xpath = "//*[@lang='en']")
    public WebElement anasayfaGorunurElementi;

    @FindBy (xpath = "//*[@href='/products']")
    public WebElement productsElementi;

    @FindBy (xpath = "(//*[@data-product-id='1'])[2]")
    public WebElement addToCartButton;

    @FindBy (xpath = "//*[@data-dismiss='modal']")
    public WebElement continueShoppingButton;

    @FindBy (xpath = "(//*[@class='product-overlay'])[2]")
    public WebElement ikinciProductsElementi;

    @FindBy (xpath = "(//*[@data-product-id='2'])[2]")
    public WebElement ikinciUrunAddButonu;


    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;
    @FindBy (xpath = "//tbody")
    public WebElement ikiUrunDogrulama;

}