<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Akun Web pake JSP dan Servlet</title><!--set title di browser-->
  <link rel="stylesheet" type="text/css" href="style.css"><!--eksternal buat css-->
  <script type="text/javascript" src='script.js'></script><!--eksternal buat javascript-->

  <script>
  function validateform(){
  var name=document.myform.firstname.value;
  var password=document.myform.password.value;
  var conpass = document.myform.repassword.value;

  if(password != conpass)
  {
      alert("password is not same");
  }

  if (firstname==null || firstname==""){
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
  <!--tabel buat separate-->
  <table width="100%" height="5%">
    <tr>
      <td><h2>ciazhar WEB</h2></td>
      <td width="500px"></td>
      <td>
        <form method="post" action="login">
          Username <input type="text" name="username" class="textbox">
          Password <input type="password" name="password" class="textbox">
          <input type="submit" value="Sign In" class="circle" onclick="return checkLogin(this.form);">
                                            <!--class buat ngasih style di textbox-->
        </form >
      </td>
    </tr>
  </table>

  <!--dapetin eror dari JS-->
  <center><h3 id="error"></h3></center>

  <!--kode Java buat exception error wrong username/password login-->
  <!--belum jalan-->
  <%
    if (request.getParameter("result")!=null) { %>
      <center>
        <div style="height: 25px; width: 280px; background-color:red">
          <b>username atau password salah !!!</b>
        </div>
      </center>
    <%
    }
  %>

  <hr>

  <!--kode Java buat exception error username telah digunakan-->
  <!--belum jalan-->
  <%
    if(request.getParameter("username")!=null){ %>
      <center>
        <div style="height: 40px; width: 400px; background-color:red">
          <b>Udah ada username di DB kami !!! <br> Coba cari yang laen.</b>
        </div>
      </center>
  <%}%>

  <table width="100%">
    <tr>
      <td width="825px" align="center"> <h1>Ini HOME PAGE !!!!</h1>
      </td>
      <td>
        <!--create form account-->
        <form name="myform" method="post" action="registration" onsubmit="return validateform()" >
                                                <!--action dilempar ke registration, liat mapping-->

          <h1>Create Account</h1>
          <table>
                                          <!--first name-->
            <tr>
              <td>Nama Depan</td>
              <td><input type="text" name="firstname" class="textbox"></td>
            </tr>
            <tr height="20px">
              <td></td>
              <td id="firstname"></td>
            </tr>
                                          <!--last name-->
            <tr>
              <td>Nama Belakang</td>
              <td><input type="text" name="lastname" class="textbox"></td>
            </tr>
            <tr height="20px">
              <td></td>
              <td id="lastname"></td>
            </tr>
                                          <!--username-->
            <tr>
              <td>User Name</td>
              <td><input type="text" autocomplete="off" name="username" id="checkusername" class="textbox" onkeyup="return checkUsername();"></td>
            </tr>                 <!--^auto complete off buat gak ngeliatin previous username>             <!^manggil fungsi onkeyup buat manggil ajax buat ngecek username available gak-->
            <tr height="20px">
              <td></td>
              <td id="username"></td>
            </tr>
                                          <!--Birth Date-->
            <tr>
              <td>Tanggal Lahir</td>
              <td>
                <select name="bday" class="dob">
                  <option>Tgl</option>
                  <!--kode java buat nampilin 1-31-->
                  <%for(int i=1; i<=31; i++){%>
                      <option><%=i%></option>
                  <%}%>
                </select>
                <select name="bmonth" class="dob">
                  <option>Bln</option>
                  <option>Jan</option>
                  <option>Feb</option>
                  <option>Mar</option>
                  <option>Apr</option>
                  <option>Mei</option>
                  <option>Jun</option>
                  <option>Jul</option>
                  <option>Agu</option>
                  <option>Sep</option>
                  <option>Okt</option>
                  <option>Nov</option>
                  <option>Des</option>
                </select>
                <select name="byear" class="dob">
                  <option>Thn</option>
                  <%for(int i=2016;i>=1945;i--){%>
                    <option><%=i%></option>
                  <%}%>
                </select>
              </td>
            </tr>
            <tr height="20px">
              <td></td>
              <td id="dob"></td>
            </tr>
                                        <!-- gender -->
            <tr>
              <td>Gender</td>
              <td>
                <input type="radio" name="gender" value="female"> Cewek
                <input type="radio" name="gender" value="male"> Cowok
                <input type="radio" name="gender" value="other"> Noris
              </td>
            </tr>
            <tr height="20px">
              <td></td>
              <td id="gender"></td>
            </tr>
                                        <!-- password -->
            <tr>
              <td>Password</td>
              <td><input type="password" name="password" class="textbox"></td>
            </tr>
            <tr height="20px">
              <td></td>
              <td id="password"></td>
            </tr>

            <tr>
              <td>Re Enter Password</td>
              <td><input type="password" name="repassword" class="textbox"></td>
            </tr>
            <tr height="20px">
              <td></td>
              <td id="repassword"></td>
            </tr>
            <tr>
              <td colspan="2">
                <input type="checkbox" name="terms"><a href="terms&condtion.jsp" target="_blank"> Saya Menyetujui Syarat dan Ketentuan yang Berlaku</a>
              </td>                                                                 <!--blank bakal open new tab link-->
            </tr>
            <tr height="20px"></tr>
            <tr>
              <td><input type="submit" value="Create" class="circle" onclick="return checkRegistration(this.form);"></td>
              <td><input type="reset" value="Clear" class="circle"></td>
            </tr>
          </table>
        </form>
      </td>
  </table>
  <hr>
  <br>
  <br>
  <hr>
</body>

</html>
