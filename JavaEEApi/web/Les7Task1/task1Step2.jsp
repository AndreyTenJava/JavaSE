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
                <form action="/les7Task1Step2" method="post">
                    <input type="hidden" name="name_value" value="<%=student.getName()%>">
                    <input type="hidden" name="surname_value" value="<%=student.getSurname()%>">
                    <input type="hidden" name="age_value" value="<%=student.getAge()%>">
                    <input type="hidden" name="university_value" value="<%=student.getUniversity()%>">
                    <input type="hidden" name="faculty_value" value="<%=student.getFaculty()%>">
                    <input type="hidden" name="group_value" value="<%=student.getGroup()%>">
                    <div class="mt-3 d-flex justify-content-between">
                        <label for="city_value" class="form-label col-2">City:</label>
                        <input id="city_value" name="city_value" type="text" placeholder="Insert city"
                               class="form-control">
                    </div>
                    <div class="mt-3 d-flex justify-content-between">
                        <label for="address_value" class="form-label col-2">Address:</label>
                        <input id="address_value" name="address_value" type="text" placeholder="Insert address"
                               class="form-control">
                    </div>
                    <div class="mt-3 d-flex justify-content-between">
                        <label for="phone_value" class="form-label col-2">Phone:</label>
                        <input id="phone_value" name="phone_value" type="text" placeholder="Insert phone"
                               class="form-control">
                    </div>
                    <div class="mt-3 d-flex">
                        <div>
                            <a href="/les7Task1Step1" class="btn btn-success px-3">BACK</a>
                        </div>
                        <button class="btn btn-success px-3 ms-3">NEXT</button>
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
