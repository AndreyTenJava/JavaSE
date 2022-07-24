<%@ page import="Lesson1_task7.Footballer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Lesson1_task7.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>

    <%@include file="vender/head.jsp"%>

    <style>
      .button_style {
        border-style: none;
        border-radius: 0;
        background-color: #00008B;
        color: white;
        padding: 5px 15px;
        margin-left: auto;
        display: block;
      }

      .font1 {
        font-size: 18px;
        font-weight: bold;
        color: #014f01;
      }

      .font2 {
        font-size: 14px;
        font-weight: bold;
        color: #1201a8;
      }

      .font3 {
        font-size: 14px;
        font-weight: bold;
        color: #9A0000FF;
      }

    </style>
  </head>
  <body>
    <div class="col-4 offset-4">
      <form action="/addPlayer" method="post">
        <div class="row mb-3">
          <label for="nameField" class="col-sm-2 col-form-label">Name:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="nameField" name="nameField">
          </div>
        </div>
        <div class="row mb-3">
          <label for="surnameField" class="col-sm-2 col-form-label">Surname:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="surnameField" name="surnameField">
          </div>
        </div>
        <div class="row mb-3">
          <label for="clubField" class="col-sm-2 col-form-label">Club:</label>
          <div class="col-sm-10">
            <select id="clubField" class="form-select" name="clubField">
              <option>Real Madrid FC</option>
              <option>Liverpool</option>
              <option>Barcelona</option>
              <option>Chelsea FC</option>
              <option>Kairat FC</option>
            </select>
          </div>
        </div>
        <div class="row mb-3">
          <label for="salaryField" class="col-sm-2 col-form-label">Salary:</label>
          <div class="col-sm-10">
            <input type="number" class="form-control" id="salaryField" name="salaryField">
          </div>
        </div>
        <div class="row mb-3">
          <label for="transferField" class="col-sm-2 col-form-label">Transfer:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="transferField" name="transferField">
          </div>
        </div>
        <button type="submit" class="button_style">Add Footballer</button>
      </form>
      <br>
      <div class="col-4 offset-4">
        <%
          ArrayList<Footballer> footballers = (ArrayList<Footballer>) request.getAttribute("player");
          if (footballers != null) {
            for (Footballer player : footballers) {
        %>
        <div class="row mb-3">
          <span class="d-block font1"> <%=player.getName() + " " + player.getSurname()%> </span>
          <span class="d-block font2"> <%="Club: " + player.getClub()%> </span>
          <span class="d-block font3"> <%="Salary: " + player.getSalary()%> </span>
          <span class="d-block font3"> <%="Transfer price: " + player.getTransferPrice()%> </span>
        </div>
        <%
            }
          }
        %>
      </div>
    </div>
  </body>
</html>
