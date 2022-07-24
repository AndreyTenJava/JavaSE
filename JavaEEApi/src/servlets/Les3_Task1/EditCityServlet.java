package servlets.Les3_Task1;

import modal.Lesson3_Task1.City;
import modal.Lesson3_Task1.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/editCity")
public class EditCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = 0L;
        try {
            id = Long.parseLong(request.getParameter("id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        City city = DBManager.getCity(id);

        if (city != null) {
            request.setAttribute("cityEdit", city);
            request.getRequestDispatcher("Les3Task1/editCity.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/404.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("nameCity");
        String code = request.getParameter("codeCity");

        City city = DBManager.getCity(id);
        if (city != null) {
            city.setName(name);
            city.setCode(code);

            if (DBManager.saveCity(city)){
                response.sendRedirect("/editCity?id=" + id + "&success");
            } else{
                response.sendRedirect("/editCity?id=" + id + "&error");
            }
        }

        response.sendRedirect("/cities");
    }
}
