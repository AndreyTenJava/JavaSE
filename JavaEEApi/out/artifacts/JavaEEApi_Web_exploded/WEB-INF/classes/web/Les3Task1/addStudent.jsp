<%@ page import="java.util.ArrayList" %>
<%@ page import="modal.Lesson3_Task1.City" %>
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
                Student added successfully!
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
            <%
                }
            %>
            <form action="/addStudent" method="post">
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">Name</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="nameStudent">
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">Surname</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="surnameStudent">
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">Birthdate</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control" name="birthdateStudent">
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">City</label>
                    <div class="col-sm-10">
                        <select class="form-select" aria-label="Default select example" name="city_idStudent">
                            <%
                                ArrayList<City> cities = (ArrayList<City>) request.getAttribute("city");
                                if (cities != null) {
                                   for (City city: cities){

                            %>
                            <option value="<%=city.getId()%>">
                                    <%=city.getName() + " / " + city.getCode()%></option>
                            <%
                                    }
                                }
                            %>
                        </select>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">ADD STUDENT</button>
            </form>
        </div>
    </div>

  </body>
</html>
