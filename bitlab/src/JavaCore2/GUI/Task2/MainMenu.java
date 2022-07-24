package JavaCore2.GUI.Task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;
    private JButton firstButton;
    private JButton secondButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent){
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        firstButton = new JButton("ADD STUDENT");
        firstButton.setSize(300, 30);
        firstButton.setLocation(100, 100);
        add(firstButton);
        firstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenu().setVisible(false);
                parent.getFirstPage().setVisible(true);
            }
        });

        secondButton = new JButton("LIST STUDENT");
        secondButton.setSize(300, 30);
        secondButton.setLocation(100, 150);
        add(secondButton);
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getSecondPage().generateTable(parent.getStudents());
                parent.getMainMenu().setVisible(false);
                parent.getSecondPage().setVisible(true);
            }
        });

        exitButton = new JButton("EXIT");
        exitButton.setSize(300, 30);
        exitButton.setLocation(100, 200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
