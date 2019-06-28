package RobotClass;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class RobotIntro {
    public static void main(String []args) throws AWTException, IOException {
        Robot robot=new Robot();
        Rectangle rectangleWindowSize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image=robot.createScreenCapture(rectangleWindowSize);
        ImageIO.write(image, "jpg", new File("src\\test\\resources\\robot"+System.currentTimeMillis()+".jpg"));

    }

}
