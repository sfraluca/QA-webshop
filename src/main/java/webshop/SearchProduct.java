package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchProduct {

    public final SelenideElement searchInput = $("input#search.input-text");
    public final SelenideElement searchIcon = $(".button.search-button");

    /**
     * Validators
     */
    public void isSearchVisible() {
        searchInput.shouldBe(Condition.visible);
    }

    public void isSearchButtonVisible() {
        searchIcon.shouldBe(Condition.visible);
    }

    /**
     * Actions
     */
    public void typeInSearchInput(String input) {
        searchInput.sendKeys(input);
    }

    public void clickOnSearchIcon() {
        searchIcon.click();
    }

    public void cleanSearchInput() {
        searchInput.clear();
    }

}
