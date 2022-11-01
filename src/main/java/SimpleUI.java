import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleUI {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.getContentPane().add(new ButtonPanel());
        frame.setSize(500,300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
