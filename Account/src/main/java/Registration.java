import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extends HttpServlet {
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
      response.setContentType("text/html;charset=UTF-8");
      ///PrintWriter gunane buat nulis html code di servlet
      try(PrintWriter out = response.getWriter()){
      String firstname = request.getParameter("firstname");
      String lastname = request.getParameter("lastname");
      String username = request.getParameter("username");
      String bday = request.getParameter("bday");
      String bmonth = request.getParameter("bmonth");
      String byear = request.getParameter("byear");
      String gender = request.getParameter("gender");
      String password = request.getParameter("password");
      String repassword = request.getParameter("repassword");

      ///klo fail
      out.println("welcome "+firstname+"but u hv some error. pls try again");

      /*buat db pake mysql*/
      Class.forName("com.mysql.jdbc.Driver");       // v DSN name
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletjsp","root","ysalovedsp329");

       //Statement buat execute query
      Statement stmt = con.createStatement();
      stmt.executeUpdate("insert into AccountDB values('"+firstname+"','"+lastname+"','"+username+"','"+bday+"','"+bmonth+"','"+byear+"','"+gender+"','"+password+"','"+repassword+"');");

      //kalo ok dia continue ke AccountCreated.jsp
      response.sendRedirect("http://localhost:8080/Account/AccountCreated.jsp");
    }
    catch(Exception e){
    }
  }
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    processRequest(request,response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    processRequest(request,response);
  }

  public String getServletInfo(){
    return "short description";
  }
}
