package luckydraw;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Demo extends JFrame {
    
    private final class ButtonActionListener implements
            ActionListener {
        private final ImagePanel imagePanel;
        private Thread imageThread;
        
        
        private ButtonActionListener(ImagePanel imagePanel) {
            this.imagePanel = imagePanel;
        }
        
        public void actionPerformed(final ActionEvent e) {
           
            if (imageThread == null || !imageThread.isAlive()) {
                imageThread = new Thread(imagePanel);
                imageThread.start();
            } else if (!imageThread.isAlive()) {
                imageThread.start();
            }
        }
    }
    
    
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Demo frame = new Demo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    
    public Demo() {
        super();
        setTitle("³é½±´ó×ªÅÌ");
        setResizable(false);
        setBounds(100, 100, 700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        final ImagePanel imagePanel = new ImagePanel();
        
        getContentPane().add(imagePanel, BorderLayout.CENTER);
        final JButton button = new JButton();
        button.setCursor(Cursor
                .getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setPressedIcon(new ImageIcon(getClass()
                .getResource("bt2.png")));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.addActionListener(new ButtonActionListener(
                imagePanel));
        
        button.setIcon(new ImageIcon(getClass().getResource(
                "bt.png")));
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorder(null);
        button.setBounds(277, 202, 139, 209);
        imagePanel.add(button);
    }
}
