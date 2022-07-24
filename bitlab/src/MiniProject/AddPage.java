package MiniProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPage extends JPanel {

    private MainFrame parent;
    private JLabel label;
    private JTextField textField;
    private JTextField textField1;
    private JComboBox agesBox;
    private Integer [] ages = new Integer[101];
    private JButton add;
    private JButton back;

    public AddPage(MainFrame parent){
        this.parent = parent;
        setSize(500,500);
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

        label = new JLabel("FACULTY");
        label.setSize(200, 30);
        label.setLocation(50, 200);
        add(label);
        agesBox = new JComboBox(ages);
        agesBox.setSize(200,30);
        agesBox.setLocation(150,200);
        add(agesBox);
        DBManager db = new DBManager();
        db.connect();

        add = new JButton("Add");
        add.setSize(100,30);
        add.setLocation(100,300);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String surname = textField1.getText();
                Integer age = (Integer) agesBox.getSelectedItem();

                Students students = new Students(null, name, surname, age);
                db.addStudent(students);

                if(!name.equals("") && !surname.equals("")){
                    textField.setText("");
                    textField1.setText("");
                    agesBox.setSelectedIndex(0);
                }
            }
        });
        add(add);
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
                parent.getAddPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

}
