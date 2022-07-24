package servlets.Les6_Task1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/les6_task1")
public class HomeTask1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        String cookieValue = "Default Site Name";

        if (cookies != null) {
            for (Cookie cookie: cookies){
                if (cookie.getName().equals("siteName")){
                    cookieValue = cookie.getValue();
                    break;
                }
            }
        }
        request.setAttribute("myCookie", cookieValue);
        request.getRequestDispatcher("Les6Task1/Task1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieValue = request.getParameter("cookieValue");

        Cookie cookie = new Cookie("siteName", cookieValue);
        response.addCookie(cookie);

        response.sendRedirect("/les6_task1");
    }
}
