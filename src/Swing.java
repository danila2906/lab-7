import com.sun.prism.image.Coords;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing {

    public Swing() {
        JFrame fram= new JFrame("Test");

        fram.setLayout(new FlowLayout());

        fram.setSize(800,800);

        fram.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Нажми меня");
        jButton.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                jButton.setBounds((int)(Math.random()*(fram.getWidth()-jButton.getWidth())),
                        (int)(Math.random()*(fram.getHeight()-jButton.getHeight())),
                        jButton.getWidth(),
                        jButton.getHeight());
            }
        });

        fram.add(jButton);
        fram.setVisible(true);
    }
}
