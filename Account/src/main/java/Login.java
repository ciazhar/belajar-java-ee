import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    try{
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      /*buat db pake mysql*/
      Class.forName("com.mysql.jdbc.Driver");       // v DSN name
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletjsp","root","ysalovedsp329");

       //Statement buat execute query
      Statement stmt = con.createStatement();
      ///bikin querry
      String query="select * from AccountDB where username= ' "+username+" ' and password=' "+password+" ' ";
      ///buat dapet string dari row itu
      ResultSet rs =stmt.executeQuery(query);

      //kalo record ketemu
      /*if(rs.next()){*/
        ///masukin ke masing'' variable
        String firstname=rs.getString("firstname");
        String bday=rs.getString("bday");
        String bmonth=rs.getString("bmonth");
        String byear=rs.getString("byear");
        String gender=rs.getString("gender");
        //bikin session
        HttpSession hs=request.getSession();
        ///bikin atribut session
        hs.setAttribute("name",firstname);
        hs.setAttribute("username",username);
        hs.setAttribute("bday",bday);
        hs.setAttribute("bmonth",bmonth);
        hs.setAttribute("byear",byear);
        hs.setAttribute("gender",gender);

        response.sendRedirect("http://localhost:8080/Account/Userhome.jsp");
      /*}
      else{
        response.sendRedirect("http://localhost:8080/Account/index.jsp?result=Failure");
      }*/

    }
    catch(Exception e){
      System.out.println(" Error ");
      e.printStackTrace();
      //response.sendRedirect("SessionExpire.jsp");
    }
  }
}
