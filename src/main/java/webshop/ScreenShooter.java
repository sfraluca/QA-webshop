package webshop;

import io.qameta.allure.Allure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.UUID;

import static com.codeborne.selenide.Selenide.screenshot;


public class ScreenShooter {

    public ScreenShooter() {}

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
