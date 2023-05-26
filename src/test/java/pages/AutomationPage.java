package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@aria-hidden='false']")
    public WebElement autoHomePage;

    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement rastgeleUrun;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement urunDetay;

    @FindBy (xpath = "//input[@id='quantity']")
    public WebElement urunAdedi;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement addCartButonu;

    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy (xpath = "//button[@class='disabled']")
    public WebElement urunAdediDogrumu;

    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement urunGorunme;

    @FindBy (xpath = "(//*[@href='/view_cart'])[1]")
    public WebElement cartButton;

    @FindBy (xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement addCart;

    @FindBy (xpath = "//*[text()='Continue Shopping']")
    public WebElement conshoping;

    @FindBy (xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingPage;

    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//u[text()='Register / Login']")
    public WebElement registerLogin;

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement name;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement email;

    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement signup;

    @FindBy (xpath = "(//div[@class='radio'])[1]")
    public WebElement radioButton;

    @FindBy (xpath = "//b[text()='Account Created!']")
    public WebElement accountDisplayed;

    @FindBy (xpath = "//a[text()='Continue']")
    public WebElement continButton;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement oturumAcildiGoruntulendi;

    @FindBy (xpath = "//ul[@class='address item box']")
    public WebElement adresDetay;

    @FindBy (xpath = "(//h2[@class='heading'])[1]")
    public WebElement siparisInceleme;

    @FindBy (xpath = "//textarea[@class='form-control']")
    public WebElement aciklaBolumu;

    @FindBy (xpath = "//a[@href='/payment']")
    public WebElement PlaceOrder;

    @FindBy (xpath = "//input[@class='form-control']")
    public WebElement cartIsmi;

    @FindBy (xpath = "//input[@name='card_number']")
    public WebElement cartNumara;

    @FindBy ( xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy ( xpath = "//input[@name='expiry_month']")
    public WebElement cartAy;

    @FindBy ( xpath = "//input[@name='expiry_year']")
    public WebElement cartYil;

    @FindBy ( xpath = "//button[@data-qa='pay-button']")
    public WebElement payButon;

    @FindBy (xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement basariMesaji;

    @FindBy ( xpath = "//a[@href='/delete_account']")
    public WebElement DeleteAccountButon;

    @FindBy ( xpath = "//b[text()='Account Deleted!']")
    public WebElement accountDeletedYazisi;

    @FindBy ( xpath = "//a[text()='Continue']")
    public WebElement devamButonu;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement erkekCinsiyetButon;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement kayitSifreKutusu;

    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement dogumGun;

    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement dogumAy;

    @FindBy(xpath = "//select[@data-qa='years']")
    public WebElement dogumYil;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement adressIlkIsim;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement adressSoyIsim;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement ulkeSecimi;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement telNO;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButonu;


}
