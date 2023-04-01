package pac1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PixelArtCasa {

    private static final int PIXEL_SIZE = 10; 

    public static void main(String[] args) {
        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();
        
        // Dibujar el fondo de la imagen
        drawBackground(20, 20, g, Color.WHITE);
        
        // Dibujar el techo de la casa
        drawTriangle(50, 5, 150, 5, 100, 50, g, Color.RED);
        
        // Dibujar el cuerpo de la casa
        drawRect(50, 50, 100, 100, g, Color.GRAY);
        
        // Dibujar la puerta de la casa
        drawRect(75, 100, 50, 50, g, Color.YELLOW);
        
        // Dibujar la ventana de la casa
        drawRect(75, 60, 50, 30, g, Color.CYAN);
        
        // Guardar la imagen
        try {
            File f = new File("casa.png");
            ImageIO.write(img, "png", f);
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen.");
        }
    }
    
    // Dibujar un rectángulo
    private static void drawRect(int x, int y, int width, int height, Graphics g, Color c) {
        g.setColor(c);
        g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width * PIXEL_SIZE, height * PIXEL_SIZE);
    }
    
    // Dibujar un triángulo
    private static void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g, Color c) {
        int[] xPoints = {x1 * PIXEL_SIZE, x2 * PIXEL_SIZE, x3 * PIXEL_SIZE};
        int[] yPoints = {y1 * PIXEL_SIZE, y2 * PIXEL_SIZE, y3 * PIXEL_SIZE};
        g.setColor(c);
        g.fillPolygon(xPoints, yPoints, 3);
    }
    
    // Dibujar el fondo de la imagen
    private static void drawBackground(int width, int height, Graphics g, Color c) {
        g.setColor(c);
        g.fillRect(0, 0, width * PIXEL_SIZE, height * PIXEL_SIZE);
    }
    
}
