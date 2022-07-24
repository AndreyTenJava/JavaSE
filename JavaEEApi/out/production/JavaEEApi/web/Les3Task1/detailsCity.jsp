<%@ page import="modal.Lesson3_Task1.City" %>
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
            City city = (City) request.getAttribute("cityDetails");

            if (city != null) {
          %>
          <table class="table table-striped">
            <tbody>
            <tr>
              <td>Name:</td>
              <td><%=city.getName()%></td>
            </tr>
            <tr>
              <td>Code:</td>
              <td><%=city.getCode()%></td>
            </tr>
            </tbody>
          </table>
          <a class="btn btn-primary btn-sm" href="/editCity?id=<%=city.getId()%>" role="button">EDIT</a>
          <%
            }
          %>
        </div>
      </div>
    </div>
  </body>
</html>
