

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtils {

    public static Image scaleImage(Image img, int w, int h) {

        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, w, h, null);
        g.dispose();

        return resizedImg;
    }

    public static Image reverseImage(String path, int horizontally, int vertically) throws IOException {
        File f = new File(path);
        BufferedImage myImage = ImageIO.read(f);
        BufferedImage reversedImage = new BufferedImage(myImage.getWidth(), myImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        for (int i = 0; i < myImage.getWidth(); i++) {
            for (int j = 0; j < myImage.getHeight(); j++) {
                Color c = new Color(0, 0, 0);
                if (horizontally > 0 && vertically > 0) {
                    c = new Color(myImage.getRGB(myImage.getWidth() - 1 - i, myImage.getHeight() - 1 - j));
                } else if (horizontally > 0) {
                    c = new Color(myImage.getRGB(myImage.getWidth() - 1 - i, j));
                } else if (vertically > 0) {
                    c = new Color(myImage.getRGB(i, myImage.getHeight() - 1 - j));
                } else {
                    c = new Color(myImage.getRGB(i, j));
                }
                reversedImage.setRGB(i, j, c.getRGB());
            }
        }
        return reversedImage;
    }

    public static int nrOfGreyPixels(String path) throws IOException {
        BufferedImage myImage = ImageIO.read(new File(path));
        int nr = 0;
        for (int i = 0; i < myImage.getWidth(); i++) {
            for (int j = 0; j < myImage.getHeight(); j++) {
                Color c = new Color(myImage.getRGB(i, j));
                int red = c.getRed();
                int blue = c.getBlue();
                int green = c.getGreen();
                if (red == blue && blue == green) {
                    nr++;
                }
                if (red == 119 && green == 136 && blue == 153) {
                    nr++;
                }
                if (red == 112 && green == 128 && blue == 144) {
                    nr++;
                }
                if (red == 47 && green == 79 && blue == 79) {
                    nr++;
                }
            }
        }
        return nr;
    }

    public static boolean toBeDeleted(String test, String real) throws IOException {
        int nje = nrOfGreyPixels(test);
        int dy = nrOfGreyPixels(real);
        return (nje < dy + 60000 && nje > dy - 60000);

    }

    public static Image cutImage(String path, int x, int y) throws IOException {
        BufferedImage myImage = ImageIO.read(new File(path));
        return myImage;
    }
}
