package servlets.Les7_Task3;

import modal.Lesson7_Task3.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/loginLes7Task3")
public class LoginLes7Task3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/Les7Task3/loginLes7Task3.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String login = request.getParameter("login_value");
      String password = request.getParameter("password_value");
      User[] users = new User[4];
      users[0] = new User(1L, "test", "asd123", "Test User");
      users[1] = new User(2L, "admin", "qwerty123", "Administrator");
      users[2] = new User(2L, "user", "zxc123", "User");

      String redirect = "/loginLes7Task3?user_error";

      for (User user: users){
          if (user != null){
              if (user.getLogin().equals(login)){
                  if (user.getPassword().equals(password)){
                      request.getSession().setAttribute("active_user", user);
                      redirect = "profileLes7Task3";
                      break;
                  }

                  redirect = "/loginLes7Task3?password_error";
              }
          }
      }

      response.sendRedirect(redirect);
    }
}
