package GUI.PhoneBook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox agesBox;
    private Integer [] ages = new Integer[101];
    private JTextArea area;
    public MainFrame(){
        for (Integer i = 0; i <= 100; i++){
            ages [i] = i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("PhoneBook");
        setSize(500,800);
        setLayout(null);

        label = new JLabel("PhoneBook");
        label.setSize(200,30);
        label.setLocation(150,150);
        add(label);

        label = new JLabel("Name:");
        label.setSize(200,30);
        label.setLocation(100,200);
        add(label);
        textField1 = new JTextField();
        textField1.setSize(200,30);
        textField1.setLocation(150,200);
        add(textField1);

        label = new JLabel("Phone:");
        label.setSize(200,30);
        label.setLocation(100,250);
        add(label);
        textField2 = new JTextField();
        textField2.setSize(200,30);
        textField2.setLocation(150,250);
        add(textField2);

        label = new JLabel("Age:");
        label.setSize(200,30);
        label.setLocation(100,300);
        add(label);
        agesBox = new JComboBox(ages);
        agesBox.setSize(200,30);
        agesBox.setLocation(150,300);
        add(agesBox);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,400);
        add(area);

        button = new JButton("ADD CONTACT");
        button.setSize(200,30);
        button.setLocation(150,350);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!text1.equals("") && !text2.equals("")){
                    area.append(text1+" "+text2+ " " +age+"\n");
                    textField1.setText("");
                    textField2.setText("");
                    agesBox.setSelectedIndex(0);
                }

            }
        });
        add(button);

    }
}


