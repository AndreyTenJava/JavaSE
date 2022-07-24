package servlets.Les2_Task1;

import modal.Lesson2_Task1.DBManager;
import modal.Lesson2_Task1.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Item> items = DBManager.getItems();
        request.setAttribute("tovary", items);
        request.getRequestDispatcher("Les2Task1/addItem.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nameItem");
        String price = request.getParameter("priceItem");
        String amount = request.getParameter("amountItem");

        Item item = new Item();
        item.setName(name);
        item.setPrice(Double.parseDouble(price));
        item.setAmount(Integer.parseInt(amount));

        DBManager.addItem(item);

        response.sendRedirect("/les2_task1");
    }
}
