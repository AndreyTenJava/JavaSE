package servlets.Les2_Task1;

import modal.Lesson2_Task1.DBManager;
import modal.Lesson2_Task1.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/les2_task1")
public class Les2_Task1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Item> items = DBManager.getItems();
        request.setAttribute("tovary", items);
        request.getRequestDispatcher("Les2Task1/Lesson2_Task1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
