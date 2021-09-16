package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.logon.LogOn;
import starter.logon.ProductFind;
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

    @When("{actor} clicks twitter link")
    public void clicksTwitter(Actor actor) {
        actor.attemptsTo( ProductFind.twitter() );
        //actor.attemptsTo( Ensure.thatTheCurrentPage().title().isEqualTo("Sauce Labs") );
    }

    @Then("{actor} sees page title {string}")
    public void sees_page_title(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.PAGE_TITLE).hasText(term) ); }

    @Then("{actor} sees page footer {string}")
    public void sees_page_footer(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.PAGE_FOOTER).hasText(term) ); }

    @Then("{actor} sees item 1 name {string}")
    public void see_item1_name(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_NAME).hasText(term) ); }

    @Then("{actor} sees item 1 description {string}")
    public void see_item1_desc(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_DESC).hasText(term) ); }

    @Then("{actor} sees item 1 price {string}")
    public void see_item1_price(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_PRICE).hasText(term) ); }

    @Then("{actor} sees item 1 add {string}")
    public void see_item1_add(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM1_ADD).hasText(term) ); }

    @Then("{actor} sees item 2 name {string}")
    public void see_item2_name(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM2_NAME).hasText(term) ); }

    @Then("{actor} sees item 2 description {string}")
    public void see_item2_desc(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM2_DESC).hasText(term) ); }

    @Then("{actor} sees item 2 price {string}")
    public void see_item2_price(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM2_PRICE).hasText(term) ); }

    @Then("{actor} sees item 2 add {string}")
    public void see_item2_add(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.ITEM2_ADD).hasText(term) ); }

    @Then("{actor} sees twitter link {string}")
    public void see_twitter_link(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.PAGE_TWITTER).attribute("href").isEqualTo(term) ); }

    @Then("{actor} sees facebook link {string}")
    public void see_facebook_link(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.PAGE_FACEBOOK).attribute("href").isEqualTo(term) ); }

    @Then("{actor} sees linkedin link {string}")
    public void see_linkedin_link(Actor actor, String term) { actor.attemptsTo( Ensure.that(ProductPage.PAGE_LINKEDIN).attribute("href").isEqualTo(term) ); }

}
