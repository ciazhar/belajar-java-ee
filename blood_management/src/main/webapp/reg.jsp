<%--
    Document   : reg
    Created on : Dec 20, 2015, 11:13:45 PM
    Author     : Oops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="register.css">

        <title>JSP Page</title>

        <script>
function validateform(){
var name=document.myform.name.value;
var password=document.myform.password.value;
var conpass = document.myform.repassword.value;

if(password != conpass)
{
    alert("password is not same");
}

if (name==null || name==""){
  alert("Name can't be blank");
  return false;
}else if(password.length<6){
  alert("Password must be at least 6 characters long.");
  return false;
  }
}
</script>
        
    </head>
    <body>
        <form name="myform" method="post" action="reg" onsubmit="return validateform()" >
        <h1>Registration page</h1>
        <div class="reg">
        <pre>
          NAME     :          <input type="text" placeholder="name" name="name" class="text" />

          SURNAME  :          <input type="text" placeholder="suname" name="surname" class="text"/>

          EMAIL    :          <input type="email" placeholder="email"  name="email" class="text"/>

          Mobile No.:         <input type="text" placeholder="Contact" name="mobile" class="text"/>

          Blood Group :       <input type="text" placeholder="blood group" name="bldgrp" class="text"/>

          PASSWORD :          <input type="password" placeholder="password" name="password" class="text"/>

          CONFIRM PASSWORD :  <input type="password" placeholder=" re password" name="repassword" class="text"/>



                          <button type="submit" name="register" class="btn">Register</button>



        </pre>

            </div>
        </form>
    </body>
</html>
