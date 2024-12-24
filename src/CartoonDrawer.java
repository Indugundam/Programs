import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CartoonDrawer extends JPanel {
    private BufferedImage image;

    public CartoonDrawer() {
        int width = 400, height = 400;
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        // Draw cartoon face
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(50, 50, 300, 300); // Face

        g2d.setColor(Color.BLACK);
        g2d.drawOval(50, 50, 300, 300); // Face border

        g2d.setColor(Color.WHITE);
        g2d.fillOval(120, 120, 60, 60); // Left eye
        g2d.fillOval(220, 120, 60, 60); // Right eye

        g2d.setColor(Color.BLACK);
        g2d.fillOval(140, 140, 20, 20); // Left pupil
        g2d.fillOval(240, 140, 20, 20); // Right pupil

        g2d.setColor(Color.RED);
        g2d.fillArc(120, 200, 160, 100, 0, -180); // Smile

        g2d.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);

        // Print pixel data
        System.out.println("Pixel Data (x, y, RGB):");
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int pixel = image.getRGB(x, y);
                System.out.printf("(%d, %d, #%06X)%n", x, y, pixel & 0xFFFFFF);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cartoon Drawer");
        CartoonDrawer panel = new CartoonDrawer();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
