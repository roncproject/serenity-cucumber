package starter.search;

import net.serenitybdd.screenplay.targets.Target;

class SearchForm {
    //static Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchInput");
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("//input[@id='searchInput']");

}
