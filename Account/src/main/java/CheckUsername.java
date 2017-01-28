import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CheckUsername extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    try{
      String username = request.getParameter("username");

      /*buat db pake mysql*/
      Class.forName("com.mysql.jdbc.Driver");       // v DSN name
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletjsp","root","ysalovedsp329");

       //Statement buat execute query
      Statement stmt = con.createStatement();
      String query="select*from AccountDB where username= ' "+username+" ' ";
      ResultSet rs =stmt.executeQuery(query);

      if(rs.next()){
        out.println("<div style='height: 20 px; width: 280 px; border: 5px solid red;background-color: red;'>Username Exist !!</div>");///fail
      }
      else{
        out.println("<div style='height: 20 px; width: 280 px; border: 5px solid green;background-color: green;'>Username Available</div>");
      }

    }
    catch(Exception e){
      System.out.println(" Error ");
      e.printStackTrace();
    }
  }
}
