package flowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {

    JFrame frame = new JFrame("Calculator");


    JTextField input1 = new JTextField(20);
    JTextField input2 = new JTextField(20);
    JTextField resultFeild = new JTextField(20);


    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiply = new JButton("*");
    JButton divide = new JButton("/");
    JButton equal = new JButton("=");

double num1,num2,result;

    public calculator(){

        frame.setLayout(new BorderLayout(50,50));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2,10,10));

        input1.setFont(new Font("Arial",Font.PLAIN,20));
        input2.setFont(new Font("Arial",Font.PLAIN,20));
        resultFeild.setFont(new Font("Arial",Font.PLAIN,20));
        input1.setHorizontalAlignment(SwingConstants.LEFT);
        input2.setHorizontalAlignment(SwingConstants.CENTER);
        resultFeild.setHorizontalAlignment(SwingConstants.RIGHT);

        input1.setBorder(new EmptyBorder(20,10,10,10));
        input2.setBorder(new EmptyBorder(20,10,10,10));
        resultFeild.setBorder(new EmptyBorder(20,10,10,10));
        //equal.setBorder(new EmptyBorder(10,10,10,10));

        JPanel display = new JPanel();
        frame.add(display,BorderLayout.NORTH);
        display.setLayout(new GridLayout(1,3,10,10));
        display.add(input1, BorderLayout.LINE_START);
        display.add(input2, BorderLayout.CENTER);
        display.add(resultFeild, BorderLayout.LINE_END);

        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(2,2,10,10));

        plus.setFont(new Font("Arial",Font.PLAIN,50));
        minus.setFont(new Font("Arial",Font.PLAIN,50));
        multiply.setFont(new Font("Arial",Font.PLAIN,50));
        divide.setFont(new Font("Arial",Font.PLAIN,50));
        equal.setFont(new Font("Arial",Font.PLAIN,50));

       JPanel equalPanel = new JPanel();
       equalPanel.add(equal, BorderLayout.CENTER);
       equalPanel.setBorder(new EmptyBorder(10,100,10,100));

        operatorPanel.add(plus);
        operatorPanel.add(minus);
        operatorPanel.add(divide);
        operatorPanel.add(multiply);
        operatorPanel.setBorder(new EmptyBorder(10,10,10,10));

        frame.add(operatorPanel,BorderLayout.CENTER);
        frame.add(equalPanel,BorderLayout.SOUTH);
        frame.setBounds(100,100,400,400);

        equal.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            num1 = Double.parseDouble(input1.getText());
            num2 = Double.parseDouble(input2.getText());

            if(e.getSource() == plus){
                result = num1 + num2;
            }
            else if(e.getSource() == minus){
                result = num1 - num2;
            }
            else if(e.getSource() == multiply){
                result = num1 * num2;
            }
            else if(e.getSource() == divide){
                if(num2 != 0){
                    result = num1 / num2;
                }
                else{
                    resultFeild.setText("Error: Division by 0");
                }

            }
            else if(e.getSource() == equal){
                resultFeild.setText(String.valueOf(result));
            }
        }
        catch (NumberFormatException ex){
            resultFeild.setText("Error: Invalid Ipput");
        }

    }

    public static void main(String[] args) {
        new calculator();
    }
}
