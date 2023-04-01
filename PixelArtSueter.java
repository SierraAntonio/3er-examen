package pac1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PixelArtSueter {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final int PIXEL_SIZE = 10;
    
    public static void main(String[] args) throws IOException {
        BufferedImage image = new BufferedImage(WIDTH*PIXEL_SIZE, HEIGHT*PIXEL_SIZE, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        
        // Fondo negro
        fillRect(0, 0, WIDTH, HEIGHT, Color.BLACK);
        
        // Mangas del suéter
        drawVerticalLine(7, 12, 5, Color.YELLOW);
        drawVerticalLine(7, 12, 6, Color.YELLOW);
        drawVerticalLine(7, 12, 14, Color.YELLOW);
        drawVerticalLine(7, 12, 15, Color.YELLOW);
        
        // Cuerpo del suéter
        fillRect(6, 7, 9, 6, Color.YELLOW);
        drawVerticalLine(6, 7, 8, Color.BLACK);
        drawVerticalLine(14, 15, 8, Color.BLACK);
        
        
        File output = new File("sueterter.png");
        ImageIO.write(image, "png", output);
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
}
