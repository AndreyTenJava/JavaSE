package MiniProject;

import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private MainMenu mainMenuPage;
    private AddPage addPage;
    private ListPage listPage;

    public static ArrayList<Students> students = new ArrayList<>();


    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENTS APPLICATION");
        setSize(500,500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addPage = new AddPage(this);
        addPage.setVisible(false);
        add(addPage);

        listPage = new ListPage(this);
        listPage.setVisible(false);
        add(listPage);


    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public AddPage getAddPage(){
        return addPage;
    }

    public ListPage getListPage(){
        return listPage;
    }

    public ArrayList<Students> students(){
        return students;
    }
}
