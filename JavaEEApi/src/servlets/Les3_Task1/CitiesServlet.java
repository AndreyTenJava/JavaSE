package servlets.Les3_Task1;

import modal.Lesson3_Task1.City;
import modal.Lesson3_Task1.DBManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/cities")
public class CitiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<City> cities = DBManager.getAllCities();
        request.setAttribute("cities", cities);
        request.getRequestDispatcher("Les3Task1/Cities.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
