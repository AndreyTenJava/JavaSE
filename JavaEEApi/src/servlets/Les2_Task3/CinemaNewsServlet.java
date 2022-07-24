package servlets.Les2_Task3;

import modal.Lesson2_Task3.DBManager;
import modal.Lesson2_Task3.News;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/cinemaNews")
public class CinemaNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<News> news = DBManager.getAllNews();
        request.setAttribute("novosti", news);
        request.getRequestDispatcher("Les2Task3/CinemaNews.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
