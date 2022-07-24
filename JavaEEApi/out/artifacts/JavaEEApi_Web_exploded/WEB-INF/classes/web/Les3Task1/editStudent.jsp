<%@ page import="modal.Lesson3_Task1.Students" %>
<%@ page import="modal.Lesson3_Task1.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <%@include file="../vender/head.jsp"%>
</head>
<body>
<div class="container">
  <%@include file="../vender/navbarLes3Task1.jsp"%>
  <div class="row">
    <div class="col-6 offset-3">
      <%
        Students student = (Students) request.getAttribute("studentEdit");

        if (student != null) {
      %>
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
      <%
        String error = request.getParameter("error");
        if (error != null) {
      %>
      <div class="alert alert-danger alert-dismissible fade show" role="alert">
        Something went wrong!
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
      </div>
      <%
        }
      %>
        <form action="/editStudent" method="post">
          <input type="hidden" name="id" value="<%=student.getId()%>">
          <div class="row mb-3">
            <label class="col-sm-2 col-form-label">Name</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" name="nameStudent" value="<%=student.getName()%>">
            </div>
          </div>
          <div class="row mb-3">
            <label class="col-sm-2 col-form-label">Surname</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" name="surnameStudent" value="<%=student.getSurname()%>">
            </div>
          </div>
          <div class="row mb-3">
            <label class="col-sm-2 col-form-label">Birthdate</label>
            <div class="col-sm-10">
              <input type="date" class="form-control" name="birthdateStudent" value="<%=student.getBirthdate()%>">
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
                <option value="<%=city.getId()%>" <% if(city.getId()==student.getCity().getId()){out.print("selected");}%>>
                  <%=city.getName() + " / " + city.getCode()%></option>
                <%
                    }
                  }
                %>
              </select>
            </div>
          </div>
          <button type="submit" class="btn btn-primary btn-sm">SAVE STUDENT</button>
          <button type="button" class="btn btn-danger btn-sm float-end" data-bs-toggle="modal" data-bs-target="#deleteStudentModal">
            DELETE STUDENT
          </button>
        </form>
        <div class="modal fade" id="deleteStudentModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <form action="/deleteStudent" method="post">
                <input type="hidden" name="id" value="<%=student.getId()%>">
                <div class="modal-header">
                  <h5 class="modal-title" id="staticBackdropLabel">Confirm Delete Process</h5>
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                  Are you sure?
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">NO</button>
                  <button type="submit" class="btn btn-danger">YES</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      <%
        }
      %>
    </div>
  </div>
</div>
</body>
</html>
