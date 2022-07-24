package servlets.Les6_Task3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(value = "/homeTask3")
public class HomeTask3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieValue = "English";

        if (cookies != null) {
            for (Cookie cookie: cookies) {
                if (cookie.getName().equals("language")){
                        cookieValue = cookie.getValue();
                        break;
                }
            }
        }
        Map<Integer, String> interface_ru = new HashMap<>();
        interface_ru.put(1, "Выберите язык:");
        interface_ru.put(2, "Выбрать");
        interface_ru.put(3, "Наименование:");
        interface_ru.put(4, "Возраст:");
        interface_ru.put(5, "Страна:");
        interface_ru.put(6, "Пол:");
        interface_ru.put(7, "Мужской");
        interface_ru.put(8, "Женский");
        interface_ru.put(9, "Номер Страховки:");
        interface_ru.put(10, "Отправить документ");

        Map<String, String> content_ru = new HashMap<>();
        content_ru.put("name", "Документ Социального Страхования");
        content_ru.put("age", "21");
        content_ru.put("country", "Казахстан");
        content_ru.put("gender", "Мужской");
        content_ru.put("number", "545 344 234 124");

        Map<Integer, String> interface_en = new HashMap<>();
        interface_en.put(1, "Choose Language:");
        interface_en.put(2, "Choose");
        interface_en.put(3, "Name:");
        interface_en.put(4, "Age:");
        interface_en.put(5, "Country:");
        interface_en.put(6, "Gender:");
        interface_en.put(7, "Male");
        interface_en.put(8, "Female");
        interface_en.put(9, "Number Insurance:");
        interface_en.put(10, "Send Document");

        Map<String, String> content_en = new HashMap<>();
        content_en.put("name", "Document Social Insurance");
        content_en.put("age", "21");
        content_en.put("country", "Kazakhstan");
        content_en.put("Gender", "Male");
        content_en.put("number", "545 344 234 124");

        if (cookieValue.equals("English")){
            request.setAttribute("interface", interface_en);
            request.setAttribute("content", content_en);
        } else {
            request.setAttribute("interface", interface_ru);
            request.setAttribute("content", content_ru);
        }

        request.setAttribute("myCookie", cookieValue);
        request.getRequestDispatcher("Les6Task3/homeTask3.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieValue = request.getParameter("languageValue");

        Cookie cookie = new Cookie("language", cookieValue);
        cookie.setMaxAge(3600*60*60);
        response.addCookie(cookie);
        response.sendRedirect("/homeTask3");
    }
}
