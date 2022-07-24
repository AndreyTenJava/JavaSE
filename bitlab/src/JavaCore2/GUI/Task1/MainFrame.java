package JavaCore2.GUI.Task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel label;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox ageBox;
    private JTextArea textArea;
    private Integer[] ages = new Integer[101];
    private JButton button;

    public MainFrame() {
        for (int i = 0; i < 101; i++){
            ages[i] = i;
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);
        setLayout(null);

        label = new JLabel("Name:");
        label.setSize(200, 30);
        label.setLocation(100, 100);
        add(label);
        textField1 = new JTextField();
        textField1.setSize(200, 30);
        textField1.setLocation(150, 100);
        add(textField1);

        label = new JLabel("Phone:");
        label.setSize(200, 30);
        label.setLocation(100, 150);
        add(label);
        textField2 = new JTextField();
        textField2.setSize(200, 30);
        textField2.setLocation(150, 150);
        add(textField2);

        label = new JLabel("Age:");
        label.setSize(200, 30);
        label.setLocation(100, 200);
        add(label);
        ageBox = new JComboBox(ages);
        ageBox.setSize(200, 30);
        ageBox.setLocation(150, 200);
        add(ageBox);

        textArea = new JTextArea();
        textArea.setSize(300, 100);
        textArea.setLocation(100, 300);
        add(textArea);

        button = new JButton("ADD CONTACT");
        button.setSize(200, 30);
        button.setLocation(150, 250);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().equals("") && !textField2.getText().equals("")) {
                    textArea.append(textField1.getText() + " - " + textField2.getText() + " - " + (Integer) ageBox.getSelectedItem() + " years \n");
                    textField1.setText("");
                    textField2.setText("");
                    ageBox.setSelectedIndex(0);
                }
            }
        });
        add(button);

    }
}
