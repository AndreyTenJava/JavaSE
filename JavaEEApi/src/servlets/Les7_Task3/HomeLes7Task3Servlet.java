package servlets.Les7_Task3;

import modal.Lesson7_Task3.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/homeLes7Task3")
public class HomeLes7Task3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("active_user");
        if (user!=null){
            request.setAttribute("current_user", user);
        }
        request.getRequestDispatcher("Les7Task3/homeLes7Task3.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
