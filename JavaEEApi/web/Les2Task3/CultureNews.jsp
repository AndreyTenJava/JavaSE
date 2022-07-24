<%@ page import="java.util.ArrayList" %>
<%@ page import="modal.Lesson2_Task3.News" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Culture News</title>
    <%@include file="../vender/head.jsp"%>
  </head>
  <body>
    <div class="container">
        <div class="row">
            <%@include file="../vender/navbarLes2Task3.jsp"%>
            <%
                ArrayList<News> news = (ArrayList<News>) request.getAttribute("novosti");
                if (news != null) {
                    for (News nw: news) {
                        if (nw.getCategory().equalsIgnoreCase("Culture")) {

            %>
            <section class="col-12 my-2" style="background-color: #c9faf5">
                <div class="fs-4 fw-bold pt-4 ps-2">
                    <%=nw.getTitle()%>
                </div>
                <div class="fs-5 py-1 py-2 ps-2">
                    <%=nw.getContent()%>
                </div>
                <div class="fs-6 py-1 pb-5 ps-2">
                    Author:
                    <strong><%=nw.getAuthor()%></strong>
                </div>
            </section>
            <%
                        }
                    }
                }
            %>

            <%@include file="../vender/footerLes2Task3.jsp"%>
        </div>
    </div>
  </body>
</html>
