package webshop;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstPageShopping extends ScreenShooter{

  public final SelenideElement slider = $(".slideshow-container ul.slideshow li.cycle-slide-active a");
  public final SelenideElement slideshowNext = $(".slideshow-container .slideshow-next");
  public final SelenideElement slideshowPrev = $(".slideshow-container .slideshow-prev");
  public final SelenideElement homepageBreadcrumbs = $(".breadcrumbs li.home a");

  private final ElementsCollection promoBanner = $$(".promos li");

  /**
   * Validators
   */
  @Step("Slider on first page")
  public void isSliderVisible() {
    takeScreenShot("Slider should be visible");
    slider.shouldBe(Condition.visible);

  }

  @Step("Slider next on first page")
  public void isSliderNextVisible() {
    takeScreenShot("Slider next should be visible");
    slideshowNext.shouldBe(Condition.visible);

  }

  @Step("Slider prev on first page")
  public void isSliderPrevVisible() {
    takeScreenShot("Slider prev should be visible");
    slideshowPrev.shouldBe(Condition.visible);

  }

  @Step("Promo Banner on first page")
  public void isPromoBannersVisible() {
    takeScreenShot("Promo banner should be visible");
    promoBanner.shouldHave(CollectionCondition.size(3));
    promoBanner.get(0).shouldBe(Condition.visible);
    promoBanner.get(1).shouldBe(Condition.visible);
    promoBanner.get(2).shouldBe(Condition.visible);
  }

  /**
   * Actions
   */
  public void clickOnHomePageBreadcrumbs() { homepageBreadcrumbs.click(); }
  public void clickOnSlideShowNext() { slideshowNext.click(); }
  public void clickOnSlideShowPrev() { slideshowPrev.click(); }

  public void clickOnPromoBanner() {
    FirstPageShopping homepageBack = new FirstPageShopping();
    promoBanner.get(0).click();
    homepageBack.clickOnHomePageBreadcrumbs();
    promoBanner.get(1).click();
    homepageBack.clickOnHomePageBreadcrumbs();
    promoBanner.get(2).click();
    homepageBack.clickOnHomePageBreadcrumbs();
  }

}
