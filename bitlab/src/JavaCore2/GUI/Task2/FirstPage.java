package JavaCore2.GUI.Task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JPanel {

    private MainFrame parent;
    private JLabel label;
    private JTextField textName;
    private JTextField textSurname;
    private JTextField textGroup;
    private JComboBox facultyBox;
    private JButton buttonAdd;
    private JButton buttonBack;

    public FirstPage(MainFrame parent){
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        String[] faculty = {"Information Technologies", "Economics", "Mathematics"};
        for (int i = 0; i < faculty.length; i++){
            faculty[i] = faculty[i];
        }

        label = new JLabel("NAME:");
        label.setSize(200, 30);
        label.setLocation(70, 100);
        add(label);
        textName = new JTextField();
        textName.setSize(200, 30);
        textName.setLocation(150, 100);
        add(textName);

        label = new JLabel("SURNAME:");
        label.setSize(200, 30);
        label.setLocation(70, 150);
        add(label);
        textSurname = new JTextField();
        textSurname.setSize(200, 30);
        textSurname.setLocation(150, 150);
        add(textSurname);

        label = new JLabel("GROUP");
        label.setSize(200, 30);
        label.setLocation(70, 250);
        add(label);
        textGroup = new JTextField();
        textGroup.setSize(200, 30);
        textGroup.setLocation(150, 250);
        add(textGroup);

        label = new JLabel("FACULTY");
        label.setSize(200, 30);
        label.setLocation(70, 200);
        add(label);
        facultyBox = new JComboBox(faculty);
        facultyBox.setSize(200, 30);
        facultyBox.setLocation(150, 200);
        add(facultyBox);

        buttonAdd = new JButton("ADD");
        buttonAdd.setSize(80, 30);
        buttonAdd.setLocation(100, 300);
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textName.getText().equals("") && !textSurname.getText().equals("") && !textGroup.getText().equals("")){
                    parent.addStudents(textName.getText(), textSurname.getText(), (String) facultyBox.getSelectedItem(), textGroup.getText());
                    textName.setText("");
                    textSurname.setText("");
                    textGroup.setText("");
                    facultyBox.setSelectedIndex(0);
                }
            }
        });add(buttonAdd);

        buttonBack = new JButton("BACK");
        buttonBack.setSize(80, 30);
        buttonBack.setLocation(250, 300);
        add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });

    }
}
