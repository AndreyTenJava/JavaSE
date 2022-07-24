<%@ page import="modal.Lesson6_Task2.Client" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
    <%@include file="../vender/head.jsp"%>
  </head>
  <body>
  <div class="container">
    <div class="row mt-5">
      <div class="col-4 offset-4">
        <%
          Client client = (Client) request.getAttribute("myCookie");

          if (client != null) {
        %>
        <form action="/client" method="post">
          <div class="mt-3 d-flex justify-content-between">
            <label for="nameValue" class="form-label col-3">Name:</label>
            <input id="nameValue" name="nameValue" type="text"
                   class="form-control" placeholder="Name">
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="surnameValue" class="form-label col-3">Surname:</label>
            <input id="surnameValue" name="surnameValue" type="text"
                   class="form-control" placeholder="Surname">
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="ageValue" class="form-label col-7">Age:</label>
            <input id="ageValue" name="ageValue" type="number" min="0" max="100"
                   class="form-control" placeholder="Age">
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="countryValue" class="form-label col-7">Country:</label>
            <select id="countryValue" name="countryValue" class="form-select">
              <option value="" <%=client.getCountry()=="" ? "selected" : ""%>></option>
              <option value="ARMENIA" <%=client.getCountry()=="ARMENIA" ? "selected" : ""%>>
                ARMENIA</option>
              <option value="BELARUS" <%=client.getCountry()=="BELARUS" ? "selected" : ""%>>
                BELARUS</option>
              <option value="GEORGIA" <%=client.getCountry()=="GEORGIA" ? "selected" : ""%>>
                GEORGIA</option>
              <option value="KAZAKHSTAN" <%=client.getCountry()=="KAZAKHSTAN" ? "selected" : ""%>>
                KAZAKHSTAN</option>
              <option value="UZBEKISTAN" <%=client.getCountry()=="UZBEKISTAN" ? "selected" : ""%>>
                UZBEKISTAN</option>
            </select>
          </div>
          <div class="mt-3 d-flex justify-content-start">
            <label class="form-label col-7">Gender:</label>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" value="male" name="genderValue" id="genderValue1"
                     <%=client.getGender()=="male" ? "selected" : ""%>>
              <label class="form-check-label" for="genderValue1">
                Male
              </label>
            </div>
            <div class="form-check">
              <input class="form-check-input" type="radio" name="genderValue" id="genderValue2" value="female"
                     <%=client.getGender()=="female" ? "selected" : ""%>>
              <label class="form-check-label" for="genderValue2">
                Female
              </label>
            </div>
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="creditCardValue" class="form-label col-3">Credit Card:</label>
            <input id="creditCardValue" name="creditCardValue" type="text"
                   class="form-control" placeholder="Number Credit Card">
          </div>
          <div class="mt-3 col-3">
            <button class="btn btn-secondary px-3">SAVE</button>
          </div>
        </form>
        <%
          }
        %>
      </div>
    </div>
  </div>

  </body>
</html>
