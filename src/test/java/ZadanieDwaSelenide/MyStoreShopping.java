package ZadanieDwaSelenide;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyStoreShopping {

    boolean isDiscountPrice;

    @Given("wlaczamy strone sklepu PrestaShop, mamy zarejestrowanego uzytkownika")
    public void wlaczamyStroneSklepuPrestaShopMamyZarejestrowanegoUzytkownika() {

        Configuration.holdBrowserOpen = true;
//        Configuration.browserSize = "1980x1080";
        Configuration.timeout = 5000;
        open("https://prod-kurs.coderslab.pl/");
    }


    @When("logowanie na stworzonego uzytkownika")
    public void logowanieNaStworzonegoUzytkownika() {

        $(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();

        $(By.name("email")).clear();
        $(By.name("email")).sendKeys("zenon@domena.pl");

        $(By.name("password")).clear();
        $(By.name("password")).sendKeys("myszka777");

        $(By.id("submit-login")).click();
    }


    @And("wybieramy do zakupu Hummingbird Printed Sweater")
    public void wybieramyDoZakupuHummingbirdPrintedSweater() {

        $(By.name("s")).sendKeys("Hummingbird printed t-shirt");
        $(By.name("s")).submit();


        $(By.xpath("//*[@id=\"js-product-list\"]//article//*[@class='product-description']//a[text()[contains(.,'Hummingbird printed t-shirt')]]")).click();

        try {
            $(By.cssSelector(".discount.discount-percentage"));
            System.out.println("Koszulka jest w promocji!! Kup taniej o 20%");
            isDiscountPrice = true;
        } catch (NoSuchElementException e) {
            System.out.println("Koszulka nie jest w promocji");
            isDiscountPrice = false;
        }

        $(By.xpath("//label/input[@value ='11']")).click();

    }


    @And("wybieramy {string} i {string}, dodajemy produkt do koszyka przechodzimy do proceed to checkout")
    public void wybieramyRozmiarIDodajemyProduktDoKoszykaPrzechodzimyDoProceedToCheckout(String size, String quantity) {

        $(By.id("group_1")).sendKeys(size);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        $(By.id("quantity_wanted")).clear();
        $(By.id("quantity_wanted")).sendKeys(quantity);

        $(By.cssSelector(".btn.btn-primary.add-to-cart")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        $(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a")).click();

        $(By.cssSelector("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.card-block > div > a")).click();
    }


    @And("potwierdzenie adresu, wybranie metody obioru")
    public void potwierdzenieAdresuWybranieMetodyObioru() {

        $(By.name("confirm-addresses")).click();

        $(By.name("confirmDeliveryOption")).click();
    }


    @And("wybranie metody platności, klikniecie order with obligation to pay")
    public void wybranieMetodyPlatnościKlikniecieOrderWithObligationToPay() {

        $(By.id("payment-option-1")).click();

        $(By.id("conditions_to_approve[terms-and-conditions]")).click();

        $(By.cssSelector(".btn.btn-primary.center-block")).click();
    }


//    @Then("screenshot z potwierdzeniem zamówienia i kwota")
//    public void screenshotZPotwierdzeniemZamówieniaIKwota() {
//    }
}

