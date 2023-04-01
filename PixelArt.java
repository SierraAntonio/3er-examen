package pac1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PixelArt {
    private static final int PIXEL_SIZE = 10;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private static BufferedImage image;
    private static Graphics2D g;
    
    public static void drawVerticalLine(int a, int b, int x, Color c) {
        for (int i = a; i <= b; i++) {
            g.setColor(c);
            g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    public static void drawHorizontalLine(int a, int b, int y, Color c) {
        for (int i = a; i <= b; i++) {
            g.setColor(c);
            g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    public static void putPixel(int x, int y, Color c) {       
        g.setColor(c);
        g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    public static void fillRect(int x, int y, int width, int height, Color c) {
        g.setColor(c);
        g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width * PIXEL_SIZE, height * PIXEL_SIZE);
    }
    
    public static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    
    public static void drawBackground(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    public static void saveImage(String fileName) throws IOException {
        File file = new File(fileName);
        ImageIO.write(image, "png", file);
    }
    
    public static void createImage() {
        image = new BufferedImage(WIDTH * PIXEL_SIZE, HEIGHT * PIXEL_SIZE, BufferedImage.TYPE_INT_RGB);
        g = image.createGraphics();
    }
}
