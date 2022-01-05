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
    }


    @And("wybieramy {string} i 5, dodajemy produkt do koszyka przechodzimy do proceed to checkout")
    public void wybieramyRozmiarIDodajemyProduktDoKoszykaPrzechodzimyDoProceedToCheckout(String rozmiar) {
    }


    @And("potwierdzenie adresu, wybranie metody obioru")
    public void potwierdzenieAdresuWybranieMetodyObioru() {
    }


    @And("wybranie metody platności, klikniecie order with obligation to pay")
    public void wybranieMetodyPlatnościKlikniecieOrderWithObligationToPay() {
    }


    @Then("screenshot z potwierdzeniem zamówienia i kwota")
    public void screenshotZPotwierdzeniemZamówieniaIKwota() {
    }
}

