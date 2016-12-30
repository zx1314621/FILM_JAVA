package luckydraw;

import java.awt.*;
import java.net.URL;

import javax.swing.JPanel;

/**
 * 
 */
public class ImagePanel extends JPanel implements Runnable {
    private static Image image;
    private static Image rotateIcon;
    private double angle = 0;
    private static Toolkit tk = Toolkit.getDefaultToolkit();
    
    public ImagePanel() {
        URL bgUrl = getClass().getResource("bg.jpg"); 
        URL rotateUrl = getClass().getResource("rotate.png");
        image = tk.createImage(bgUrl);
        rotateIcon = tk.createImage(rotateUrl);
        setOpaque(false);
        setLayout(null);
    }
    
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        if (image != null) {
            g.drawImage(image, 0, 0, width, height, this);
        }
        Graphics2D g1 = (Graphics2D) g.create();
        
        g1.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        if (rotateIcon != null) {
            int iconWidth = rotateIcon.getWidth(this);
            int iconHeight = rotateIcon.getHeight(this);
            g1.rotate(Math.toRadians(angle), width / 2,
                    height / 2);
            g1.drawImage(rotateIcon, width / 2 - iconWidth / 2,
                    height / 2 - iconHeight / 2, this);
        }
    }
    
    int count = 0;
    int temp = 0;
    int randNum = 0;
    
    public void run() {
        double stAngle = Math.random() * 360;
        angle = stAngle;
        while (angle < stAngle + 1200) {
            angle += 6;
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        double sleepTime = 10;
        while (sleepTime < 90) {
            angle += 6;
            repaint();
            try {
                Thread.sleep((int) (sleepTime += 0.5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
