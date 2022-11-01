import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        JButton but1 = new JButton("Turn me on");
        setLayout(new GridLayout(2,4));

        for (int i=0; i<5; i++){
            addAButton();
        }

        JOptionPane dlog = new JOptionPane("Error: You suck");
        add(dlog);
        dlog.showMessageDialog(null, "New Message", "alert", JOptionPane.ERROR_MESSAGE);

        JPasswordField pwd = new JPasswordField();
        add(pwd);
        pwd.getPassword();
    }

    private void addAButton() {
        JButton but = new JButton("Turn me on");
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Claire's fat");
            }
        });
        add(but);
    }
}
