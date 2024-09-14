package clsPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JFrame frame = new JFrame();
    JLabel userName = new JLabel("User Name:");
    TextField userInput = new TextField();
    JLabel password = new JLabel("Password: ");
    TextField passInput = new TextField();

    JButton login = new JButton("Login");
    JLabel showMessage = new JLabel();

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login) {
            if(userInput.getText().equals("zeliot")
                    && passInput.getText().equals("7171")) {
                System.out.println("Login Successful");
                showMessage.setText("Login Successful");
            }
            else{
                System.out.println("Invalid credentials");
                showMessage.setText("Invalid password or username, Try again..");
            }
        }
    }

    public Login() {

        userName.setBounds(50, 50, 120, 30);
        userInput.setBounds(200, 50, 120, 30);
        password.setBounds(50, 150, 120, 30);
       // password.setBounds(50, 100, 100, 30);
        passInput.setBounds(200, 150, 120, 30);
        login.setBounds(100, 250, 100, 30);
        showMessage.setBounds(100,300,200,30);



        frame.setBounds(100, 50, 400, 400);
        //frame.setTitle("Login");
        //frame.setName("login");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(userName);
        frame.add(userInput);
        frame.add(passInput);
        frame.add(password);
        frame.add(login);
        frame.add(showMessage);
        login.addActionListener(this);
    }


    public static void main(String[] args)
    {
        new Login();
    }




}
