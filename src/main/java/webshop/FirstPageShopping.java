package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FirstPageShopping extends ScreenShooter{
  public final SelenideElement slider = $(".slideshow-container ul.slideshow li.cycle-slide-active a");
  public final SelenideElement breadcrumbsMen = $(".breadcrumbs li.category5");
  public final SelenideElement breadcrumbsWomen = $(".breadcrumbs");
  public final SelenideElement breadcrumbesEyeWear = $(".breadcrumbs li.category18");
  public final SelenideElement slideshowNext = $(".slideshow-container .slideshow-next");
  public final SelenideElement slideshowPrev = $(".slideshow-container .slideshow-prev");
  public final SelenideElement homepageBreadcrumbs = $(".breadcrumbs li.home");
  public final SelenideElement homepageOnPageNotFound = $("div.std a");

  /**
   * Validators
   */
  public void isHomepageVisible() { homepageBreadcrumbs.shouldBe(Condition.visible); }

  public void isSliderVisible() { slider.shouldBe(Condition.visible); }

  public void isSliderNextVisible() { slideshowNext.shouldBe(Condition.visible); }

  public void  isSliderPrevVisible() { slideshowPrev.shouldBe(Condition.visible); }

  public void isBreadcrumbsMenVisible() { breadcrumbsMen.shouldBe(Condition.visible); }

  public void isBreadcrumbsWomenVisible() { breadcrumbsWomen.shouldBe(Condition.visible); }

  public void isBreadcrumbsEyeWearVisible() { breadcrumbesEyeWear.shouldBe(Condition.visible); }

  public void isHomePageOnPageNotFoundVisible() { homepageOnPageNotFound.shouldBe(Condition.visible); }
  /**
   * Actions
   */
  public void clickOnHomePageBreadcrumbs() { homepageBreadcrumbs.click(); }

  public void clickOnSlideShow() { slider.click(); }

  public void clickOnSlideShowNext() { slideshowNext.click(); }

  public void clickOnSlideShowPrev() { slideshowPrev.click(); }

  public void clickOnHomepageOnPageNotFound() { homepageOnPageNotFound.click(); }

}
