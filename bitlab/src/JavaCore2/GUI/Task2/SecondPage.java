package JavaCore2.GUI.Task2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {
    private MainFrame parent;
    private JButton buttonBack;
    private String[] header = {"ID", "Name", "Surname", "Faculty", "Group"};
    private JTable table;
    private JScrollPane scrollPane;

    public SecondPage(MainFrame parent){
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        buttonBack = new JButton("BACK");
        buttonBack.setSize(100,30);
        buttonBack.setLocation(180, 350);
        add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });

        table = new JTable();
        table.setFont(new Font("Calibri",Font.PLAIN, 10));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(370, 200);
        scrollPane.setLocation(50, 70);
        add(scrollPane);
    }

    public void generateTable(Students[] students){
        Object[][] data = new Object[students.length][5];
        for (int i = 0; i < parent.getIndex(); i++){
            data[i][0] = students[i].getId();
            data[i][1] = students[i].getName();
            data[i][2] = students[i].getSurname();
            data[i][3] = students[i].getFaculty();
            data[i][4] = students[i].getGroup();
        }

        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);
    }
}
