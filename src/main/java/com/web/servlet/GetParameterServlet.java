package com.web.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;


public class GetParameterServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // dapatkan nama yang telah di-inputkan oleh user
    String userName = request.getParameter("userName");
    // dapatkan object dari PrintWriter dan gunakanlah untuk memberikan output berupa salam
    PrintWriter out = response.getWriter();
    out.println("<HTML><BODY><H1>");
    out.println("HELLO AND WELCOME, " + userName + "!");
    out.println("</H1></BODY></HTML>");
    out.close();
  }

}
