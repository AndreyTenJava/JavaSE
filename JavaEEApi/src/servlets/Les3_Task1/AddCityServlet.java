package servlets.Les3_Task1;

import modal.Lesson3_Task1.City;
import modal.Lesson3_Task1.DBManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/addCity")
public class AddCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("Les3Task1/addCity.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("nameCity");
        String code = request.getParameter("codeCity");

        DBManager.addCity(new City(null, name, code));
        response.sendRedirect("/addCity?success");
    }
}
