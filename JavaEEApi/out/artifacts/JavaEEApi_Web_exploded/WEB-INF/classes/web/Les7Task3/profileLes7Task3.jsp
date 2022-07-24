<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
        <%@include file="../vender/head.jsp"%>
    </head>
    <body>
        <%@include file="../vender/navbarLes7Task3.jsp"%>
       <div class="container">
           <div class="row mt-5">
               <div class="col-6 mx-auto">
                   <h1 class="text-centre">
                       HELLO
                       <%
                           if (currentUser!=null){
                               out.print(currentUser.getFull_name());
                           }
                       %>
                       !
                   </h1>
               </div>
           </div>
       </div>

    </body>
</html>
