<%@ page import="Lesson2_Task1.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Lesson2_Task1</title>

        <%@include file="vender/head.jsp"%>

    </head>
    <body>
    <%@include file="vender/navbarLes2Task1.jsp"%>
        <div class="container">
            <div class="row mt-5">
                <div class="col-sm-12">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                            <th>PRICE</th>
                            <th>AMOUNT</th>
                            <th>DETAILS</th>
                        </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("tovary");

                                if (items != null) {
                                    for (Item it: items) {

                            %>
                            <tr>
                                <td>
                                    <%=it.getId()%>
                                </td>
                                <td>
                                    <%=it.getName()%>
                                </td>
                                <td>
                                    <%=it.getPrice()%>
                                </td>
                                <td>
                                    <%=it.getAmount()%>
                                </td>
                                <td>
                                    <a href="/details?id=<%=it.getId()%>" class="btn btn-info btn-sm">DETAILS</a>
                                </td>
                            </tr>

                            <%
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
