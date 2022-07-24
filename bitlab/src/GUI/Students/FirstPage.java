package GUI.Students;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JPanel {
    private MainFrame parent;

    private JLabel label;
    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox facultyBox;
    private String [] faculty = {"Information Technologies", "Economics", "Mathematics"};
    private JButton add;
    private JButton back;

    public FirstPage(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("NAME");
        label.setSize(200, 30);
        label.setLocation(50, 100);
        add(label);
        textField = new JTextField();
        textField.setSize(200,30);
        textField.setLocation(150,100);
        add(textField);

        label = new JLabel("SURNAME");
        label.setSize(200, 30);
        label.setLocation(50, 150);
        add(label);
        textField1 = new JTextField();
        textField1.setSize(200, 30);
        textField1.setLocation(150,150);
        add(textField1);

        label = new JLabel("GROUP");
        label.setSize(200, 30);
        label.setLocation(50, 250);
        add(label);
        textField2 = new JTextField();
        textField2.setSize(200,30);
        textField2.setLocation(150,250);
        add(textField2);

        label = new JLabel("FACULTY");
        label.setSize(200, 30);
        label.setLocation(50, 200);
        add(label);
        facultyBox = new JComboBox(faculty);
        facultyBox.setSize(200,30);
        facultyBox.setLocation(150,200);
        add(facultyBox);

        add = new JButton("Add");
        add.setSize(100,30);
        add.setLocation(100,300);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                String faculty = (String) facultyBox.getSelectedItem();

                Students students = new Students(MainFrame.studentNumber+1, text, text1, faculty, text2);
                MainFrame.st[MainFrame.studentNumber]=students;
                MainFrame.studentNumber++;

                if(!text.equals("") && !text1.equals("") && !text2.equals("")){
                    textField.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    facultyBox.setSelectedIndex(0);
                }
            }
        }); add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        back = new JButton("Back");
        back.setSize(100, 30);
        back.setLocation(250, 300);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}
