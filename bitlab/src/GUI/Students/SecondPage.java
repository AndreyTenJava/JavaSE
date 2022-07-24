package GUI.Students;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {
    private MainFrame parent;

    private JLabel label;
    private JTextArea area;
    private JButton button;
    private JButton back;

    public SecondPage(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("LIST ALL STUDENTS");
        label.setSize(300, 30);
        label.setLocation(200, 50);
        add(label);

        area = new JTextArea();
        area.setSize(400, 250);
        area.setLocation(50, 100);
        add(area);

        button = new JButton("LIST ALL STUDENTS");
        button.setSize(200, 30);
        button.setLocation(150, 350);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i<MainFrame.studentNumber; i++){
                    area.append(MainFrame.st[i].toString()+'\n');
                }
            }
        });add(button);

        back = new JButton("Back");
        back.setSize(100, 30);
        back.setLocation(200, 400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}

