package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchProduct extends ScreenShooter {

    public final SelenideElement searchInput = $("input#search.input-text");
    public final SelenideElement searchIcon = $(".button.search-button");

    /**
     * Validators
     */
    @Step("Search visibility")
    public void isSearchVisible() {
        takeScreenShot("Search should be visible");
        searchInput.shouldBe(Condition.visible);
    }

    @Step("Search button visibility")
    public void isSearchButtonVisible() {
        takeScreenShot("Search button should be visible");
        searchIcon.shouldBe(Condition.visible);
    }


    /**
     * Actions
     */
    @Step("Typing in search input")
    public void typeInSearchInput(String input) {
        takeScreenShot("Type in search input");
        searchInput.sendKeys(input);
    }

    public void clickOnSearchIcon() {
        searchIcon.click();
    }

    public void cleanSearchInput() {
        searchInput.clear();
    }

}
