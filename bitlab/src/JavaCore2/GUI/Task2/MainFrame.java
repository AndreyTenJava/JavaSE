package JavaCore2.GUI.Task2;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainMenu mainMenu;
    private FirstPage firstPage;
    private SecondPage secondPage;
    private Students[] students = new Students[10];
    private int index = 0;

    public MainFrame (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("STUDENT APPLICATION");
        setSize(500, 500);
        setLayout(null);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);
        add(mainMenu);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public void addStudents(String name, String surname, String faculty, String group) {
        students[index] = new Students(index+1, name, surname, faculty, group);
        index++;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
