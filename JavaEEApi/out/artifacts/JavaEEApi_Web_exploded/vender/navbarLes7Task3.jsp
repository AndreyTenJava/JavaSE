<%@ page import="modal.Lesson7_Task3.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%
        User currentUser = (User) request.getAttribute("current_user");
    %>
    <div class="container">
        <nav class="navbar navbar-expand-lg bg-info">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <%
                            if (currentUser != null){
                        %>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/profileLes7Task3"><%=currentUser.getFull_name()%></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/logoutLes7Task3">Logout</a>
                        </li>
                        <%
                            } else {
                        %>
                        <li class="nav-item">
                            <a class="nav-link fw-bold" href="/homeLes7Task3">Home</a>

                        </li>
                        <li class="nav-item">
                            <a class="nav-link fw-bold" href="/loginLes7Task3">Login</a>
                        </li>
                        <%
                            }
                        %>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
