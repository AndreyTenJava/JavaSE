package servlets.Les1_Task7;

import modal.Lesson1_Task7.DBManager;
import modal.Lesson1_Task7.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/les1_task7")
public class Les1_Task7Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Footballer> footballers = DBManager.getAllFootballers();
        request.setAttribute("player", footballers);
        request.getRequestDispatcher("Les1Task7/Lesson1_Task7.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
