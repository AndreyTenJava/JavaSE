<%@ page import="java.util.ArrayList" %>
<%@ page import="modal.Lesson3_Task1.City" %>
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
                    <a href="/addCity" class="btn btn-success bt-sm">+ADD NEW</a>
                </div>
                <div class="col-sm-12">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Code</th>
                            <th>Details</th>
                        </tr>
                        </thead>
                        <tbody>
                        <%
                            ArrayList<City> cities = (ArrayList<City>) request.getAttribute("cities");

                            if (cities != null) {
                                for (City city: cities) {

                        %>
                        <tr>
                            <td>
                                <%=city.getId()%>
                            </td>
                            <td>
                                <%=city.getName()%>
                            </td>
                            <td>
                                <%=city.getCode()%>
                            </td>

                            <td>
                                <a href="/detailsCity?id=<%=city.getId()%>" class="btn btn-dark btn-sm">DETAILS</a>
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
