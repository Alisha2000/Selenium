package RobotClass;

import Utilities.Driver;
import org.testng.annotations.DataProvider;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class RobotIntro2 {
    public static void main(String[]args)throws AWTException{
        pressKeypadKeys();

    }
    public static void pressKeypadKeys() throws AWTException{
        Driver.getDriver("chrome").get("https://facebook.com");


        Robot robot=new Robot();
       // robot.mouseWheel(15);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
    }

}
