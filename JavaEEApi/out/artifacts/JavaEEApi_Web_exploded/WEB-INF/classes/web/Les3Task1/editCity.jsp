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
        <div class="col-6 offset-3">
          <%
            City city = (City) request.getAttribute("cityEdit");

            if (city != null) {
          %>
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
            <form action="/editCity" method="post">
              <input type="hidden" name="id" value="<%=city.getId()%>">
              <div class="row mb-3">
                <label class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" name="nameCity" value="<%=city.getName()%>">
                </div>
              </div>
              <div class="row mb-3">
                <label class="col-sm-2 col-form-label">Code</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" name="codeCity" value="<%=city.getCode()%>">
                </div>
              </div>
              <button type="submit" class="btn btn-primary btn-sm">SAVE CITY</button>
              <button type="button" class="btn btn-danger btn-sm float-end" data-bs-toggle="modal" data-bs-target="#deleteCityModal">
                DELETE CITY
              </button>
            </form>
            <div class="modal fade" id="deleteCityModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <form action="/deleteCity" method="post">
                    <input type="hidden" name="id" value="<%=city.getId()%>">
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
