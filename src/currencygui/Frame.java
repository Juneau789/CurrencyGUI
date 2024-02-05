
package currencygui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Frame extends JFrame implements ActionListener
{

    JButton convert = new JButton("Convert Currency");
    JButton addReview = new JButton("Add a Review");
    JButton checkReview = new JButton("Check Reviews");
    JButton exit = new JButton("EXIT");;
    
    public Frame()
    {
        
        JLabel welcome = new JLabel("Hi, Welcome to the Currency Converter!");
  
            welcome.setForeground(Color.BLACK);
            welcome.setVerticalAlignment(JLabel.TOP);
            welcome.setHorizontalAlignment(JLabel.CENTER);
            welcome.setBounds(2, 3, 275, 20);
            welcome.setFont(new Font("Serif", Font.BOLD, 15));
            
        JPanel welcomePanel = new JPanel();
       
            welcomePanel.setBackground(Color.lightGray);
            welcomePanel.setBounds(115, 0, 280, 30);
            welcomePanel.add(welcome);
            welcomePanel.setLayout(null);
            
            
        JLabel choice = new JLabel("Please select one of the following:");
        
            choice.setForeground(Color.BLACK);
            choice.setFont(new Font("Serif", Font.PLAIN, 15));
            choice.setVerticalAlignment(JLabel.TOP);
            choice.setHorizontalAlignment(JLabel.CENTER);
            choice.setBounds(12, 3, 275, 20);
            
        //Converter Button
            
            convert.setBackground(Color.darkGray);
            convert.setBounds(78, 70, 150, 30);
            convert.setFocusable(false);
            convert.addActionListener(this);
            
        //Add Review Button
            
            addReview.setBackground(Color.darkGray);
            addReview.setBounds(78, 100, 150, 30);
            addReview.setFocusable(false);
            
        //Check review Button
            
            checkReview.setBackground(Color.darkGray);
            checkReview.setBounds(78, 130, 150, 30);
            checkReview.setFocusable(false);
            
        //Exit Button
            
            exit.setBackground(Color.darkGray);
            exit.setBounds(78, 265, 150, 30);
            exit.addActionListener(e -> System.exit(0));
            exit.setFocusable(false);
                
        JPanel choicePanel = new JPanel();
            
            choicePanel.setBackground(Color.lightGray);
            choicePanel.setBounds(112, 80, 300, 300);
            choicePanel.add(choice);
            choicePanel.add(convert);
            choicePanel.add(addReview);
            choicePanel.add(checkReview);
            choicePanel.add(exit);
            choicePanel.setLayout(null);
            
        //JPanel mainPanel = new JPanel();
        
            //mainPanel.setBounds(0, 0, 500, 500);
            //mainPanel.setBackground(Color.GRAY);
            //mainPanel.add(welcome);
            //mainPanel.add(choice);
        
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("Currency Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        this.setLayout(null);
        
        //this.add(mainPanel);
        this.add(welcomePanel);
        this.add(choicePanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent a) 
    {
        
        if(a.getSource() == convert)
        {
            
            this.dispose();
            ConverterWindow converterWindow = new ConverterWindow();
            
        }
    
    }
    
}
