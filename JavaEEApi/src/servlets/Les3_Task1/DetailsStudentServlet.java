package servlets.Les3_Task1;

import modal.Lesson3_Task1.DBManager;
import modal.Lesson3_Task1.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/detailsStudent")
public class DetailsStudentServlet extends HttpServlet {
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
                request.setAttribute("studentDetails", student);
                request.getRequestDispatcher("Les3Task1/detailsStudent.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/404.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
