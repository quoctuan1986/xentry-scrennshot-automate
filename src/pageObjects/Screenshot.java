package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {
    private static WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public static void madeScreenshot(String fileName, String folder) throws Exception{
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.home") + "/Downloads/"+folder+"Test_14.01.2020"+"/"+fileName+".PNG";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        FileUtils.copyFile(scrFile, new File(path));
    }
}
