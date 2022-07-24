package servlets.Les6_Task2;

import modal.Lesson6_Task2.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/client")
public class ClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        Client client = new Client();

        if (cookies != null) {
            for (Cookie cookie: cookies){
                if (cookie.getName().equals("clientName")){
                    client.setName(cookie.getValue());
                } else if (cookie.getName().equals("clientSurname")) {
                    client.setSurname(cookie.getValue());
                } else if (cookie.getName().equals("clientAge")) {
                    client.setAge(Integer.parseInt(cookie.getValue()));
                } else if (cookie.getName().equals("clientCountry")){
                    client.setCountry(cookie.getValue());
                } else if (cookie.getName().equals("clientGender")){
                    client.setGender(cookie.getValue());
                }else if (cookie.getName().equals("clientCreditCard")){
                    client.setCreditCard(cookie.getValue());
                }
            }
        }

        request.setAttribute("myCookie", client);
        request.getRequestDispatcher("Les6Task2/client.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String clientName = request.getParameter("nameValue");
        String clientSurname = request.getParameter("surnameValue");
        String clientAge = request.getParameter("ageValue");
        String clientCountry= request.getParameter("countryValue");
        String clientGender = request.getParameter("genderValue");
        String clientCreditCard = request.getParameter("creditCardValue");

        Cookie cookie = new Cookie("clientName", clientName);
        cookie.setMaxAge(3600*24*30);
        response.addCookie(cookie);

        cookie = new Cookie("clientSurname", clientSurname);
        cookie.setMaxAge(3600*24*30);
        response.addCookie(cookie);

        cookie = new Cookie("clientAge", clientAge);
        cookie.setMaxAge(3600*24*30);
        response.addCookie(cookie);

        cookie = new Cookie("clientCountry", clientCountry);
        cookie.setMaxAge(3600*24*30);
        response.addCookie(cookie);

        cookie = new Cookie("clientGender", clientGender);
        cookie.setMaxAge(3600*24*30);
        response.addCookie(cookie);

        cookie = new Cookie("clientCreditCard", clientCreditCard);
        cookie.setMaxAge(3600*24*30);
        response.addCookie(cookie);

        response.sendRedirect("/client");


    }
}
