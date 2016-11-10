package com.web.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletKedua extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Servlet ServletKedua</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Servlet ServletKedua at " + request.getContextPath() + "</h1>");
    out.println("</body>");
    out.println("</html>");
    out.close();
  }
}
