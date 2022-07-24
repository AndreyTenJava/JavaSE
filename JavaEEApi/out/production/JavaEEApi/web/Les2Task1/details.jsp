<%@ page import="modal.Lesson2_Task1.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>

        <%@include file="../vender/head.jsp"%>

    </head>
    <body>
        <div class="container">
            <%@include file="../vender/navbarLes2Task1.jsp"%>
            <div class="row mt-5">
                <div class="col-sm-12">
                    <%
                        Item item = (Item)request.getAttribute("item");
                        if (item != null) {
                    %>
                    <div class="alert alert-success" role="alert">
                        <h4 class="alert-heading"><%=item.getName()%></h4>
                        <p>PRICE: <%=item.getPrice()%> USD</p>
                        <hr>
                        <p class="mb-0">AMOUNT: <%=item.getAmount()%> ITEMS</p>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
    </body>
</html>
