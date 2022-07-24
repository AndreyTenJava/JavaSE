<%@ page import="modal.Lesson3_Task1.Students" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>allStudents</title>
        <%@include file="../vender/head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="../vender/navbarLes3Task1.jsp"%>
            <div class="row mt-5">
                <div class="col-sm-12">
                    <a href="/addStudent" class="btn btn-success bt-sm">+ADD NEW</a>
                </div>
                <div class="col-sm-12">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Surname</th>
                            <th>Birthdate</th>
                            <th>City</th>
                            <th>Details</th>
                        </tr>
                        </thead>
                        <tbody>
                        <%
                            ArrayList<Students> students = (ArrayList<Students>) request.getAttribute("studentsList");

                            if (students != null) {
                                for (Students st: students) {

                        %>
                        <tr>
                            <td>
                                <%=st.getId()%>
                            </td>
                            <td>
                                <%=st.getName()%>
                            </td>
                            <td>
                                <%=st.getSurname()%>
                            </td>
                            <td>
                                <%=st.getBirthdate()%>
                            </td>
                            <td>
                                <%=st.getCity().getName()+ "/" +st.getCity().getCode()%>
                            </td>

                            <td>
                                <a href="/detailsStudent?id=<%=st.getId()%>" class="btn btn-dark btn-sm">DETAILS</a>
                            </td>
                        </tr>

                        <%
                                }
                            }
                        %>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
