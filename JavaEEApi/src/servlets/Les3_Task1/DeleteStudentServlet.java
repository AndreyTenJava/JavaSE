package servlets.Les3_Task1;

import modal.Lesson3_Task1.DBManager;
import modal.Lesson3_Task1.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        Students student = DBManager.getStudent(id);

        if (student != null) {

            if (DBManager.deleteStudent(student)) {
                response.sendRedirect("/allStudents");
            } else {
                response.sendRedirect("/editStudent?id="+id+"&error");
            }

        }else {
            response.sendRedirect("/allStudents");
        }
    }
}
