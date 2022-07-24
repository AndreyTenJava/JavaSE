package servlets.Les7_Task2;

import modal.Lesson7_Task2.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/item_les7_task2")
public class ItemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Item[] all_items = new Item[4];
        all_items[0] = new Item(1L, "Adidas F50", 50);
        all_items[1] = new Item(2L, "Reebok R30", 35);
        all_items[2] = new Item(3L, "Nike Total 90", 45);
        all_items[3] = new Item(4L, "Puma 44", 30);

        ArrayList<Item> choose_items = new ArrayList<>();
        HttpSession session = request.getSession();
        choose_items = (ArrayList<Item>) session.getAttribute("choose_items");

        request.setAttribute("choose_items", choose_items);
        request.setAttribute("all_items", all_items);
        request.getRequestDispatcher("Les7Task2/item.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id_value"));
        String name = request.getParameter("name_value");
        int price = Integer.parseInt (request.getParameter("price_value"));

        Item item = new Item();
        item.setId(id);
        item.setName(name);
        item.setPrice(price);

        ArrayList<Item> choose_items;
        HttpSession session = request.getSession();
        choose_items = (ArrayList<Item>) session.getAttribute("choose_items");

        if (choose_items == null) {
            choose_items = new ArrayList<>();
        }
        choose_items.add(item);

        session.setAttribute("choose_items", choose_items);

        response.sendRedirect("/item_les7_task2");
    }
}
