<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>AddStudent</title>
        <%@include file="../vender/head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="../vender/navbarLes3Task1.jsp"%>
            <div class="col-6 offset-3">
                <%
                    String success = request.getParameter("success");
                    if (success != null) {
                %>
                <div class="alert alert-success alert-dismissible fade show" role="alert">
                    City added successfully!
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
                <%
                    }
                %>
                <form action="/addCity" method="post">
                    <div class="row mb-3">
                        <label class="col-sm-2 col-form-label">Name</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="nameCity" required placeholder="Name">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label class="col-sm-2 col-form-label">Code</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="codeCity" required placeholder="Code">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">ADD CITY</button>
                </form>
            </div>
        </div>
    </body>
</html>
