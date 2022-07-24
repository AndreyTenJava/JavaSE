<%@ page import="modal.Lesson7_Task1.Student" %>
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
                    Student student = (Student) request.getAttribute("one_student");
                    if (student != null){

                %>
                <form action="/les7Task1Step1" method="post">
                    <input type="hidden" name="city_value" value="<%=student.getCity()%>">
                    <input type="hidden" name="address_value" value="<%=student.getAddress()%>">
                    <input type="hidden" name="phone_value" value="<%=student.getPhone()%>">
                    <input type="hidden" name="university_value" value="<%=student.getUniversity()%>">
                    <input type="hidden" name="faculty_value" value="<%=student.getFaculty()%>">
                    <input type="hidden" name="group_value" value="<%=student.getGroup()%>">
                    <div class="mt-3 d-flex justify-content-between">
                        <label for="name_value" class="form-label col-2">Name:</label>
                        <input id="name_value" name="name_value" type="text" placeholder="Insert name"
                               class="form-control">
                    </div>
                    <div class="mt-3 d-flex justify-content-between">
                        <label for="surname_value" class="form-label col-2">Surname:</label>
                        <input id="surname_value" name="surname_value" type="text" placeholder="Insert surname"
                               class="form-control">
                    </div>
                    <div class="mt-3 d-flex justify-content-between">
                        <label for="age_value" class="form-label col-2">Age:</label>
                        <input id="age_value" name="age_value" type="number"
                               class="form-control" min="0" max="100" placeholder="Insert age">
                    </div>
                    <div class="mt-3 col-3">
                        <button class="btn btn-success px-3">NEXT</button>
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
