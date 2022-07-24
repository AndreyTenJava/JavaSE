package servlets.Les2_Task1;

import modal.Lesson2_Task1.DBManager;
import modal.Lesson2_Task1.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        Item item = DBManager.getItem(id);

        if (item!=null) {
            request.setAttribute("item", item);
            request.getRequestDispatcher("Les2Task1/details.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("/404.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
