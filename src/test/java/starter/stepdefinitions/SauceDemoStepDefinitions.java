package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.logon.LogOn;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;
import starter.logon.ProductPage;

public class SauceDemoStepDefinitions {

    @Given("{actor} is going to SauceDemo")
    public void shopAtSauceDemo(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSauceDemoHomePage());
    }

    @When("{actor} enters username {string}")
    public void entersUserName(Actor actor, String term) {
        actor.attemptsTo(
                LogOn.username(term)
        );
    }

    @When("{actor} enters password {string}")
    public void entersPassword(Actor actor, String term) {
        actor.attemptsTo(
                LogOn.password(term)
        );
    }

    @When("{actor} clicks login button")
    public void clicksLogin(Actor actor) {
        actor.attemptsTo(
                LogOn.login()
        );
    }


    @Then("{actor} should see page with title {string}")
    public void should_see_page_with_title(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(ProductPage.TITLE).hasText(term)
        );
    }


}
