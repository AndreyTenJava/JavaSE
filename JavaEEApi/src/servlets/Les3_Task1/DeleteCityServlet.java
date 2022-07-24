package servlets.Les3_Task1;

import modal.Lesson3_Task1.City;
import modal.Lesson3_Task1.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteCity")
public class DeleteCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        City city = DBManager.getCity(id);

        if (city != null) {

            if (DBManager.deleteCity(city)) {
                response.sendRedirect("/cities");
            } else {
                response.sendRedirect("/editCity?id="+id+"&error");
            }

        }else {
            response.sendRedirect("/allCity");
        }
    }
}
