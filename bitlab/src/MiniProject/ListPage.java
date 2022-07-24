package MiniProject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListPage extends JPanel {

    private MainFrame parent;

    private JButton back;

    private String header[] = {"Name", "Surname", "Age"};
    private JTable table;
    private JScrollPane scrollPane;

    public ListPage(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(150,300);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getListPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });

        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(400,300);
        scrollPane.setLocation(50,50);
        add(scrollPane);
    }

    public void generateTable(ArrayList<Students> students){

        Object data [][] = new Object[students.size()][3];
        for (int i = 0; i < students.size(); i++){
            data[i][0] = students.get(i).getName();
            data[i][1] = students.get(i).getSurname();
            data[i][2]= students.get(i).getAge();
        }
        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);
    }

}
