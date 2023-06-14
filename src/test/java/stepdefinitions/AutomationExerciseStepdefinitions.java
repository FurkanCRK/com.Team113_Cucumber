package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Collections;

public class AutomationExerciseStepdefinitions {


    AutoExerPage autoExerPage = new AutoExerPage();
    Faker faker = new Faker();
    String emailAdress;
    String firstName;
    Actions actions;

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        autoExerPage.signUpLinki.click();
    }


    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        autoExerPage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() throws InterruptedException {
        actions = new Actions(Driver.getDriver());

        actions.click(autoExerPage.mrButonu)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("7")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("2000").perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("07100")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();
    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        autoExerPage.createAccountButonu.click();
    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {
        Assert.assertTrue(autoExerPage.accountCreatedYaziElementi.isDisplayed());
    }

    @And("user Create an account bolumune name ve email adresi girer")
    public void userCreateAnAccountBolumuneNameVeEmailAdresiGirer() {
        firstName=faker.name().firstName();
        autoExerPage.signUpNameKutusu.sendKeys(firstName);
        emailAdress=faker.internet().emailAddress();
        autoExerPage.signUpEmailKutusu.sendKeys(emailAdress);
    }

    @Then("Login to your account blumunde email kutusuna @isareti olmayan email adresi yazar")
    public void login_to_your_account_blumunde_email_kutusuna_isareti_olmayan_email_adresi_yazar() {
        autoExerPage.loginEmailKutusu.sendKeys("ByeByeWorld");
    }
    @Then("password kutusuna sifre yaar ve enter'a tiklar")
    public void password_kutusuna_sifre_yaar_ve_enter_a_tiklar() {
        autoExerPage.loginPasswordKutusu.sendKeys("SeeYouSoon"+ Keys.ENTER);
    }

    @Then("sisteme giris yapilamadigini test eder")
    public void sistemeGirisYapilamadiginiTestEder() {
        Assert.assertTrue(autoExerPage.loginPasswordKutusu.isEnabled());
    }

    @Given("Navigate to url {string}")
    public void navigate_to_url(String gidilecekSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekSayfa));

    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(autoExerPage.anasayfaGorunurElementi.isDisplayed());

    }
    @Given("Click Products button")
    public void Click_Products_button(){
        autoExerPage.productsElementi.click();
    }

    @Given("Click Continue Shopping button")
    public void Click_Continue_Shopping_button(){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.bekle(3);
        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",autoExerPage.continueShoppingButton);

    }

    @Given("Click View Cart button")
    public void Click_View_Cart_button(){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",autoExerPage.viewCartButton);
    }

    @Given("Hover over first product and click {string}")
    public void hover_over_first_product_and_click(String string) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


        ReusableMethods.hover(autoExerPage.addToCartButton);
        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",autoExerPage.addToCartButton);


    }
    @Given("Hover over second product and click {string}")
    public void hover_over_second_product_and_click(String string) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.bekle(5);
        //ReusableMethods.hover(autoExerPage.ikinciProductsElementi);
        jse.executeScript("arguments[0].scrollIntoView(true);",autoExerPage.ikinciProductsElementi);

        autoExerPage.ikinciUrunAddButonu.click();


    }
    @Given("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertTrue(autoExerPage.ikiUrunDogrulama.isDisplayed());

    }
    @Given("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        Assert.assertTrue(autoExerPage.ikiUrunDogrulama.isDisplayed());

    }

}