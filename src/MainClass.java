import javax.accessibility.Accessible;
import java.awt.*;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> PACKAGE_NAME
 * Class Name -> Main
 * Copyright © : 9/7/2022
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class MainClass {

    public static void main(String[] args) {
        ImageObserver myObserver = new ImageObserver() {
            public boolean imageUpdate(Image image, int flags, int x, int y, int width, int height) {
                if ((flags & HEIGHT) != 0)
                    System.out.println("Image height = " + height);
                if ((flags & WIDTH) != 0)
                    System.out.println("Image width = " + width);
                if ((flags & FRAMEBITS) != 0)
                    System.out.println("Another frame finished.");
                if ((flags & SOMEBITS) != 0)
                    System.out.println("Image section :" + new Rectangle(x, y, width, height));
                if ((flags & ALLBITS) != 0)
                    System.out.println("Image finished!");
                if ((flags & ABORT) != 0)
                    System.out.println("Image load aborted...");
                return true;
            }
        };

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("D:\\AndroidStudioProjects\\OppProject\\photo_2022-09-13_23-04-31.jpg");
        toolkit.prepareImage(img, -1, -1, myObserver);
    }

}