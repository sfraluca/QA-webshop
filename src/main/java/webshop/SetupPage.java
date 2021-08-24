package webshop;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.UUID;

import static com.codeborne.selenide.Selenide.screenshot;


public class SetupPage {

    public SetupPage() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true));
    }

    public void takeScreenShot()  {
        takeScreenShot("");
    }

    public void takeScreenShot(String name) {
        try {
            Allure.addAttachment("PrintScreen " + name,
                    Files.newInputStream(Paths.get(Objects.requireNonNull(screenshot(UUID.randomUUID().toString())).replace("file:/", "")))
            );
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
