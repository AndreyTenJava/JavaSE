package servlets.Les1_Task7;

import modal.Lesson1_Task7.DBManager;
import modal.Lesson1_Task7.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/addPlayer")
public class AddFootballer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nameField");
        String surname = request.getParameter("surnameField");
        String club = request.getParameter("clubField");
        String salary = request.getParameter("salaryField");
        String transfer = request.getParameter("transferField");

        Footballer player = new Footballer();
        player.setName(name);
        player.setSurname(surname);
        player.setClub(club);
        player.setSalary(Integer.parseInt(salary));
        player.setTransferPrice(Integer.parseInt(transfer));

        DBManager.addFootballer(player);

        response.sendRedirect("les1_task7");
    }
}
