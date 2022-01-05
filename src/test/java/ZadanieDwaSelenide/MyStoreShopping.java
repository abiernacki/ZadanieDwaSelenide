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
    }


    @When("logowanie na stworzonego uzytkownika")
    public void logowanieNaStworzonegoUzytkownika() {
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

