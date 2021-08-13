package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.logon.LogOn;
import starter.navigation.NavigateTo;
import starter.logon.ProductPage;
import starter.logon.LogForm;


public class SauceDemoStepDefinitions {

    @Given("{actor} is going to SauceDemo")
    public void shopAtSauceDemo(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSauceDemoHomePage());
    }

    @Then("{actor} sees login cred {string}")
    public void sees_login_cred(Actor actor, String term) { actor.attemptsTo( Ensure.that(LogForm.LOGIN_CRED).hasText(term) ); }

    @Then("{actor} sees login pass {string}")
    public void sees_login_pass(Actor actor, String term) { actor.attemptsTo( Ensure.that(LogForm.LOGIN_PASS).hasText(term) ); }

    @When("{actor} enters username {string}")
    public void entersUserName(Actor actor, String term) { actor.attemptsTo( LogOn.username(term) ); }

    @When("{actor} enters password {string}")
    public void entersPassword(Actor actor, String term) { actor.attemptsTo( LogOn.password(term) ); }

    @When("{actor} clicks login button")
    public void clicksLogin(Actor actor) { actor.attemptsTo( LogOn.login() ); }

    @Then("{actor} sees page title {string}")
    public void sees_page_title(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.PAGE_TITLE).hasText(term) ); }

    @Then("{actor} sees item 1 name {string}")
    public void see_backpack_title(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_NAME).hasText(term) ); }

    @Then("{actor} sees item 1 description {string}")
    public void see_backpack_text(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_DESC).hasText(term) ); }

    @Then("{actor} sees item 1 price {string}")
    public void see_backpack_price(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_PRICE).hasText(term) ); }

    @Then("{actor} sees item 1 add {string}")
    public void see_backpack_add(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_ADD).hasText(term) ); }


}
