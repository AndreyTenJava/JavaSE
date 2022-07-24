<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <%@include file="../vender/head.jsp"%>
    </head>
    <body>
        <div class="container">
            <div class="row mt-5">
                <div class="col-sm-12">
                    <h1 class="text-center">
                        <%
                            String cookieValue = (String) request.getAttribute("myCookie");
                            out.print(cookieValue);
                        %>
                    </h1>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 offset-3 mx-auto mt-5">
                        <form action="/les6_task1" method="post">
                            <div class="d-flex justify-content-between">
                                <label for="cookieValue" class="form-label col-sm-3">Name of a Site:</label>
                                <input id="cookieValue" type="text" name="cookieValue" class="form-control" placeholder="Insert name">
                                <div class="col-sm-3 ms-3">
                                    <button type="submit" class="btn btn-secondary">Set Site Name</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
