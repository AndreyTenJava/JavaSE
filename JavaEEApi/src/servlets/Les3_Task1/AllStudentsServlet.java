package servlets.Les3_Task1;

import modal.Lesson3_Task1.DBManager;
import modal.Lesson3_Task1.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/allStudents")
public class AllStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Students> students = DBManager.getAllStudents();
        request.setAttribute("studentsList", students);
        request.getRequestDispatcher("Les3Task1/allStudents.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
