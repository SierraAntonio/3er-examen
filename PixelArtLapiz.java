package pac1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PixelArtLapiz {

    private static final int WIDTH = 32; 
    private static final int HEIGHT = 32; 
    private static final int PIXEL_SIZE = 10; 

    public static void main(String[] args) throws IOException {
        BufferedImage img = new BufferedImage(WIDTH * PIXEL_SIZE, HEIGHT * PIXEL_SIZE, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();

        drawBackground(WIDTH, HEIGHT, Color.BLUE);
        putPixel(4, 2, Color.GRAY);
        putPixel(5, 2, Color.GRAY);
        putPixel(6, 2, Color.GRAY);
        drawHorizontalLine(4, 6, 3, Color.GRAY);
        putPixel(4, 4, Color.BLACK);
        putPixel(5, 4, Color.BLACK);
        drawVerticalLine(4, 6, 5, Color.YELLOW);
        putPixel(7, 5, Color.RED);
        putPixel(8, 6, Color.RED);
        putPixel(9, 7, Color.RED);
        putPixel(10, 8, Color.RED);
        
        File outputfile = new File("lapiz.png");
        ImageIO.write(img, "png", outputfile);
    }

    private static void drawVerticalLine(int a, int b, int x, Color c) {
        for (int i = a; i <= b; i++) {
            putPixel(x, i, c);
        }
    }

    private static void drawHorizontalLine(int a, int b, int y, Color c) {
        for (int i = a; i <= b; i++) {
            putPixel(i, y, c);
        }
    }

    private static void putPixel(int x, int y, Color c) {
        Graphics g = getImageGraphics();
        g.setColor(c);
        g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
    }

    private static void drawBackground(int width, int height, Color c) {
        Graphics g = getImageGraphics();
        g.setColor(c);
        g.fillRect(0, 0, width * PIXEL_SIZE, height * PIXEL_SIZE);
    }

    private static Graphics getImageGraphics() {
        BufferedImage img = new BufferedImage(WIDTH * PIXEL_SIZE, HEIGHT * PIXEL_SIZE, BufferedImage.TYPE_INT_RGB);
        return img.getGraphics();
    }

}
