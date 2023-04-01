package pac1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PixelArtEspejo {
    private static final int PIXEL_SIZE = 10;
    private static final int WIDTH = 21;
    private static final int HEIGHT = 21;
    
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(WIDTH * PIXEL_SIZE, HEIGHT * PIXEL_SIZE, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        
        drawBackground(WIDTH, HEIGHT, Color.BLACK, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 10, Color.WHITE, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 9, Color.BLACK, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 8, Color.WHITE, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 7, Color.BLACK, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 6, Color.WHITE, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 5, Color.BLACK, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 4, Color.WHITE, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 3, Color.BLACK, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 2, Color.WHITE, g);
        drawCircle(WIDTH / 2, HEIGHT / 2, 1, Color.BLACK, g);
        putPixel(WIDTH / 2, HEIGHT / 2, Color.WHITE, g);
        
        try {
            File output = new File("espejo.png");
            ImageIO.write(image, "png", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void drawCircle(int x, int y, int radius, Color c, Graphics g) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    putPixel(x + i, y + j, c, g);
                }
            }
        }
    }
    
    private static void putPixel(int x, int y, Color c, Graphics g){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void drawBackground(int width, int height, Color c, Graphics g) {
    	g.setColor(c);
    	g.fillRect(0, 0, width * PIXEL_SIZE, height * PIXEL_SIZE);                
    }
}
