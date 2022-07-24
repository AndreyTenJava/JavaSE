<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <%@include file="../vender/head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="../vender/navbarLes2Task1.jsp"%>
            <div class="col-4 offset-4">
                <form action="/addItem" method="post">
                    <div class="mb-3">
                        <label for="nameItem" class="form-label">Name</label>
                        <input type="text" class="form-control" id="nameItem" name="nameItem">
                    </div>
                    <div class="mb-3">
                        <label for="priceItem" class="form-label">Price</label>
                        <input type="number" class="form-control" id="priceItem" name="priceItem">
                    </div>
                    <div class="mb-3">
                        <label for="amountItem" class="form-label">Amount</label>
                        <input type="number" class="form-control" id="amountItem" name="amountItem">
                    </div>
                    <button type="submit" class="btn btn-primary" style="background-color: #144230; color: white">ADD ITEM</button>
                </form>
            </div>
        </div>
    </body>
</html>
