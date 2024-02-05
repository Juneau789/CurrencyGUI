
package currencygui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ConverterWindow extends JFrame implements ActionListener
{

    JFrame convertFrame = new JFrame();
    JButton back = new JButton("Return To Main Menu");
    String[] currencies = {"Dollars", "Euros", "Rupees", "Yen"};
    JComboBox currencyBox1 = new JComboBox(currencies);
    JComboBox currencyBox2 = new JComboBox(currencies);
    JTextField firstCurrency = new JTextField();
    JTextField secondCurrency = new JTextField();
    
    public ConverterWindow()
    {
     
        JLabel promptLabel = new JLabel("Please select what currency you wish to convert.");
                
                promptLabel.setForeground(Color.BLACK);
                promptLabel.setVerticalAlignment(JLabel.TOP);
                promptLabel.setHorizontalAlignment(JLabel.CENTER);
                promptLabel.setFont(new Font("Serif", Font.BOLD, 15));
                promptLabel.setBounds(2, 3, 300, 20);
        
        JPanel promptPanel = new JPanel();
        
            promptPanel.setBackground(Color.LIGHT_GRAY);
            promptPanel.setBounds(90, 0, 325, 30);
            promptPanel.add(promptLabel);
            
        //back button
        
            back.setBackground(Color.DARK_GRAY);
            back.setBounds(65, 265, 175, 30);
            back.addActionListener(this);
            back.setFocusable(false);
            
        //String[] currencies = {"Dollars", "Euros", "Rupees", "Yen"};    
            
        //JComboBox currencyBox1 = new JComboBox(currencies);
        
            currencyBox1.setBounds(175, 10, 110, 30);
            currencyBox1.addActionListener(this);
        
        //JComboBox currencyBox2 = new JComboBox(currencies);
        
            currencyBox2.setBounds(175, 80, 110, 30);
            currencyBox2.addActionListener(this);
        
        JLabel to = new JLabel("TO");
        
            to.setForeground(Color.BLACK);
            to.setFont(new Font("Serif", Font.PLAIN, 12));
            to.setBounds(215, 45, 50, 30);
            
        //JTextField firstCurrency = new JTextField("Enter Amount Here");
        
            firstCurrency.setBounds(20 , 10, 125, 30);
            firstCurrency.setForeground(Color.BLACK);
            firstCurrency.setFont(new Font("Serif", Font.PLAIN, 13));
            firstCurrency.addActionListener(this);
    
        //JTextField secondCurrency = new JTextField("Enter Amount Here");
        
            secondCurrency.setBounds(20 , 80, 125, 30);
            secondCurrency.setForeground(Color.BLACK);
            secondCurrency.setFont(new Font("Serif", Font.PLAIN, 13));
            secondCurrency.addActionListener(this);
            
        JPanel menuPanel = new JPanel();
        
            menuPanel.setBackground(Color.LIGHT_GRAY);
            menuPanel.setBounds(105, 80, 300, 300);
            menuPanel.setLayout(null);
            menuPanel.add(back);
            menuPanel.add(currencyBox1);
            menuPanel.add(currencyBox2);
            menuPanel.add(to);
            menuPanel.add(firstCurrency);
            menuPanel.add(secondCurrency);
        
        
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("Currency Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        this.setLayout(null);
        
        this.add(promptPanel);
        this.add(menuPanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    
        
        
        
        
    }
    
}
