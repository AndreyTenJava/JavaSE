<%@ page import="modal.Lesson3_Task1.Students" %>
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
        <div class="col-lg-4 m-auto mt-5">
          <%
            Students student = (Students) request.getAttribute("studentDetails");

            if (student != null) {
          %>
          <table class="table table-striped">
            <tbody>
            <tr>
              <td>Name:</td>
              <td><%=student.getName()%></td>
            </tr>
            <tr>
              <td>Surname:</td>
              <td><%=student.getSurname()%></td>
            </tr>
            <tr>
              <td>Birthdate:</td>
              <td><%=student.getBirthdate()%></td>
            </tr>
            <tr>
              <td>City:</td>
              <td><%=student.getCity().getName()+ "/" +student.getCity().getCode()%></td>
            </tr>
            </tbody>
          </table>
          <a class="btn btn-primary btn-sm" href="/editStudent?id=<%=student.getId()%>" role="button">EDIT</a>
          <%
            }
          %>
        </div>
      </div>
    </div>
  </body>
</html>
