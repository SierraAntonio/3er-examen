package pac1;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PixelArtHielo {
    private static final int PIXEL_SIZE = 10;
    
    public static void main(String[] args) {
        int width = 50;
        int height = 50;
        
        BufferedImage image = new BufferedImage(width * PIXEL_SIZE, height * PIXEL_SIZE, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        
        // Fondo negro
        fillRect(0, 0, width, height, Color.BLACK);
        
        // Hielo
        fillRect(21, 16, 8, 2, new Color(193, 242, 254));
        fillRect(20, 18, 10, 2, new Color(193, 242, 254));
        fillRect(19, 20, 12, 2, new Color(193, 242, 254));
        fillRect(18, 22, 14, 2, new Color(193, 242, 254));
        fillRect(17, 24, 16, 2, new Color(193, 242, 254));
        fillRect(16, 26, 18, 2, new Color(193, 242, 254));
        fillRect(15, 28, 20, 2, new Color(193, 242, 254));
        fillRect(14, 30, 22, 2, new Color(193, 242, 254));
        fillRect(13, 32, 24, 2, new Color(193, 242, 254));
        fillRect(12, 34, 26, 2, new Color(193, 242, 254));
        fillRect(11, 36, 28, 2, new Color(193, 242, 254));
        fillRect(10, 38, 30, 2, new Color(193, 242, 254));
        fillRect(9, 40, 32, 2, new Color(193, 242, 254));
        fillRect(8, 42, 34, 2, new Color(193, 242, 254));
        fillRect(7, 44, 36, 2, new Color(193, 242, 254));
        fillRect(6, 46, 38, 2, new Color(193, 242, 254));
        fillRect(5, 48, 40, 2, new Color(193, 242, 254));
        
       
        File outputfile = new File("PixelArtHielo.png");
        try {
            ImageIO.write(image, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width * PIXEL_SIZE, height * PIXEL_SIZE);
    }
}

