
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame{
    public App(){
        super("App");

        // Create JPanel
        JPanel jp = new JPanel();

        //Create JLabel
        JLabel userLabel = new JLabel("Username");
        jp.add(userLabel);
        JTextField userText = new JTextField(10);
        jp.add(userText);
        JLabel passLabel = new JLabel("Password");
        jp.add(passLabel);
        JTextField passText = new JTextField(10);
        jp.add(passText);

        // Create Login button
        JButton login = new JButton("Login");
        login.setBounds(50,100,95,30);
        jp.add(login);
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               String username = userText.getText();
               String password = passText.getText();
               if(username.equals("Admin")&& password.equals("admin")){
                JOptionPane.showMessageDialog(login, "Login Successful");
               } else{
                JOptionPane.showMessageDialog(login, "Invalid Username or password");
               }
            }
            
        });
        
        // Create register button
        JButton register = new JButton("Register");
        register.setBounds(50,100,95,30);
        jp.add(register);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String username = userText.getText();
                String password = passText.getText();
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Save username and password to a file or database
                    
                    // Create a new JFrame for the new window
                    JFrame registerWindow = new JFrame("Registration Successful");
                    
                    // Create a JLabel to display a message
                    JLabel successLabel = new JLabel();
                    JLabel newName = new JLabel("UserName");
                    successLabel.add(newName);
                    JTextField newNameText = new JTextField(10);
                    successLabel.add(newNameText);
                    registerWindow.add(successLabel);
                    
                    // Set the size and visibility of the new window
                    registerWindow.setSize(300, 200);
                    registerWindow.setVisible(true);
                    registerWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the new window
                    
                    // Show a dialog box to notify the user
                    JOptionPane.showMessageDialog(register, "Registration Successful");
                } else {
                    JOptionPane.showMessageDialog(register, "Please fill in both username and password");
                }
            }
        });
        add(jp);
        jp.setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new App();
    }
}
