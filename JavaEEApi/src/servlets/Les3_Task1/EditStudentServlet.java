package servlets.Les3_Task1;

import modal.Lesson3_Task1.City;
import modal.Lesson3_Task1.DBManager;
import modal.Lesson3_Task1.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/editStudent")
public class EditStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = 0L;
        try {
            id = Long.parseLong(request.getParameter("id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Students student = DBManager.getStudent(id);

        if (student != null) {
            ArrayList<City> cities = DBManager.getAllCities();
            request.setAttribute("city", cities);
            request.setAttribute("studentEdit", student);
            request.getRequestDispatcher("Les3Task1/editStudent.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/404.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("nameStudent");
        String surname = request.getParameter("surnameStudent");
        String birthdate = request.getParameter("birthdateStudent");
        Long city_id = Long.parseLong(request.getParameter("city_idStudent"));

        City city = DBManager.getCity(city_id);

        if (city != null) {

            Students student = DBManager.getStudent(id);

            if (student != null) {
                student.setName(name);
                student.setSurname(surname);
                student.setBirthdate(birthdate);
                student.setCity(city);

                if (DBManager.saveStudent(student)) {
                    response.sendRedirect("/editStudent?id=" + id + "&success");
                } else {
                    response.sendRedirect("/editStudent?id=" + id + "&error");
                }
            }
        }
        response.sendRedirect("/allStudents");
    }
}
