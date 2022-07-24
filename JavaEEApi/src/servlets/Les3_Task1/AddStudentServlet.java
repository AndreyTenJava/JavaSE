package servlets.Les3_Task1;

import modal.Lesson3_Task1.City;
import modal.Lesson3_Task1.DBManager;
import modal.Lesson3_Task1.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

    @WebServlet(value = "/addStudent")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<City> cities = DBManager.getAllCities();
        request.setAttribute("city", cities);
        request.getRequestDispatcher("Les3Task1/addStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("nameStudent");
        String surname = request.getParameter("surnameStudent");
        String birthdate = request.getParameter("birthdateStudent");
        Long city_id = Long.parseLong(request.getParameter("city_idStudent"));

        City city = DBManager.getCity(city_id);

        if (city != null) {
            DBManager.addStudents(new Students(null, name, surname, birthdate, city));
            response.sendRedirect("/addStudent?success");
        } else {
            response.sendRedirect("/addStudent?error");
        }
    }
}
