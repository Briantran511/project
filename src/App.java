
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame{
    public App(){
        super("App");
        // Create JPanel
        // Create JLabel
        // Create JButton

        
        JPanel jp = new JPanel();
        JLabel userLabel = new JLabel("Username");
        jp.add(userLabel);
        JTextField userText = new JTextField(10);
        jp.add(userText);
        JLabel passLabel = new JLabel("Password");
        jp.add(passLabel);
        JTextField passText = new JTextField(10);
        jp.add(passText);
        add(jp);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new App();

    }
}
