package com.company.features;

import com.company.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidEmulatorChrome extends BaseTest {

    @Test
    public void testOpenChromeEmulatorNexus5Android7(){

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","7.0");
        cap.setCapability("deviceName","Nexus5Android7");
        cap.setCapability("avd","Nexus5Android7");
        cap.setCapability("avdArgs","-port 5557");

        cap.setCapability("browserName", "Chrome");

        //Para Windows
        cap.setCapability("chromedriverExecutableDir",
                "CAMBIAR_POR_SU_RUTA/projectg3-appium-e2e/resources/drivers/windows");

        //Para MAC
        /*cap.setCapability("chromedriverExecutableDir",
                "/Users/jhumbertoh/Proyectos/Publicos/projectg3-appium-e2e/resources/drivers/mac");*/


        configAppiumDriver(cap);

        System.out.println(".....");

    }
}
