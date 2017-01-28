<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>::WELCOME::</title>
    <link rel="stylesheet" type="text/css" href="style.css">///ngasih eksternal css
  </head>
  <body>
  <!--avoid back button sehabis logout-->
  <%
    response.setHeader("Cache-Control","no-store");///HTTP 1.1
    response.setHeader("Pragma","no-cache");///HTTP 1.0
    response.setDateHeader("Expires",0);///prevent caching at the proxy server
  %>
  <!--kalo username null send ke SessionExpire-->
  <%
    if(session.getAttribute("name")==null){
      response.sendRedirect("SessionExpire.jsp");
    }
  %>
  <div align="right" style="width:100%; height:5%; background-color:brown; font-size: 20px;">
    <!--dapetin username dari session-->
    <% session.getAttribute("username"); %>
    <!--link buat logout-->
    <a href="http://localhost:8080/Account/Signout.jsp">Logout</a><br>
  </div>
  <div align="right" style="font-size:40px">
    <!--dapetin Tanggal Kelahiran dari session-->
    Your Birth : <font color="yellow"><%=session.getAttribute("bday")%>-<%=session.getAttribute("bmonth")%><%=session.getAttribute("byear")%></font>
  </div>
  <center>
    <h1>Welcome, <font color="yellow"><%=session.getAttribute("name")%></font></h1>
    <%=session.getAttribute("gender")%>
    <br><br><br><br>
  </center>
  </body>
</html>
