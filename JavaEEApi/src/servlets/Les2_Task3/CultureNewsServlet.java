package servlets.Les2_Task3;

import modal.Lesson2_Task3.DBManager;
import modal.Lesson2_Task3.News;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/cultureNews")
public class CultureNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<News> news = DBManager.getAllNews();
        request.setAttribute("novosti", news);
        request.getRequestDispatcher("Les2Task3/CultureNews.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
