<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
    <%@include file="../vender/head.jsp"%>
  </head>
  <body>
  <div class="container">
    <div class="row mt-5">
      <div class="col-6 offset-3">
        <%
          String cookieValue = (String) request.getAttribute("myCookie");
          Map<Integer, String> inter_face = (Map) request.getAttribute("interface");
          Map<Integer, String> content = (Map) request.getAttribute("content");
          if (cookieValue != null && inter_face != null && content != null) {
        %>
        <form action="/homeTask3" method="post">
          <div class="d-flex justify-content-between">
            <label for="languageValue" class="form-label col-3"><%=inter_face.get(1)%></label>
            <select id="languageValue" name="languageValue" class="form-select">
              <option value="English" <%=cookieValue.equals("English") ? "selected" : ""%>>English</option>
              <option value="Русский" <%=cookieValue.equals("Русский") ? "selected" : ""%>>Русский</option>
            </select>
            <div class="col-3 ms-3">
              <button class="btn-btn-sm-light"><%=inter_face.get(2)%></button>
            </div>
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="nameValue" class="form-label col-3"><%=inter_face.get(3)%></label>
            <input id="nameValue" name="nameValue" type="text"
                   class="form-control" value="<%=content.get("name")%>">
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="ageValue" class="form-label col-3"><%=inter_face.get(4)%></label>
            <input id="ageValue" name="ageValue" type="number" min="0" max="100"
                   class="form-control" value="<%=content.get("age")%>">
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="countryValue" class="form-label col-3"><%=inter_face.get(5)%>></label>
            <select id="countryValue" name="countryValue" class="form-select">
              <option value="<%=cookieValue.equals("English") ? "ARMENIA" : "АРМЕНИЯ"%>"
                      <%=(content.get("country")=="ARMENIA" ||
                              content.get("country")=="АРМЕНИЯ") ? "selected" : ""%>>
                <%=cookieValue.equals("English") ? "ARMENIA" : "АРМЕНИЯ"%></option>
              <option value="<%=cookieValue.equals("English") ? "BELARUS" : "БЕЛОРУСЬ"%>"
                      <%=(content.get("country")=="BELARUS" ||
                              content.get("country")=="БЕЛОРУСЬ") ? "selected" : ""%>>
                <%=cookieValue.equals("English") ? "BELARUS" : "БЕЛОРУСЬ"%></option>
              <option value="<%=cookieValue.equals("English") ? "GEORGIA" : "ГРУЗИЯ"%>"
                      <%=(content.get("country")=="GEORGIA" ||
                              content.get("country")=="ГРУЗИЯ") ? "selected" : ""%>>
                <%=cookieValue.equals("English") ? "GEORGIA" : "ГРУЗИЯ"%></option>
              <option value="<%=cookieValue.equals("English") ? "KAZAKHSTAN" : "КАЗАХСТАН"%>"
                      <%=(content.get("country")=="KAZAKHSTAN" ||
                              content.get("country")=="КАЗАХСТАН") ? "selected" : ""%>>
                <%=cookieValue.equals("English") ? "KAZAKHSTAN" : "КАЗАХСТАН"%></option>
              <option value="<%=cookieValue.equals("English") ? "UZBEKISTAN" : "УЗБЕКИСТАН"%>"
                      <%=(content.get("country")=="UZBEKISTAN" ||
                              content.get("country")=="УЗБЕКИСТАН") ? "selected" : ""%>>
                <%=cookieValue.equals("English") ? "UZBEKISTAN" : "УЗБЕКИСТАН"%></option>
            </select>
          </div>
          <div class="mt-3 d-flex justify-content-start">
            <label class="form-label col-3"><%=inter_face.get(6)%></label>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" value="Male" name="genderValue" id="genderValue1"
                     class="form-check-input" <%=(content.get("gender") == "Male" ||
                    content.get("gender") == "Мужской") ? "checked" : ""%>>
              <label class="form-check-label" for="genderValue1"><%=inter_face.get(7)%></label>
            </div>
            <div class="form-check">
              <input class="form-check-input" type="radio" name="genderValue" id="genderValue2" value="Female"
                             class="form-check-input" <%=(content.get("gender") == "Female" ||
                                       content.get("gender") == "Женский") ? "checked" : ""%>>
              <label class="form-check-label" for="genderValue2"><%=inter_face.get(8)%></label>
            </div>
          </div>
          <div class="mt-3 d-flex justify-content-between">
            <label for="numberValue" class="form-label col-3"><%=inter_face.get(9)%>></label>
            <input id="numberValue" name="numberValue" type="text"
                   class="form-control" value="<%=content.get("number")%>">
          </div>
          <div class="mt-3 col-3">
            <button class="btn btn-secondary px-3"><%=inter_face.get(10)%></button>
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
