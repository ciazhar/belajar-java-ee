package com.web.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class HaloController extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException {

    //res.getWriter().println("halo saya dari java servlet HaloController");
    PrintWriter out = res.getWriter();
    out.println("<html>");
    out.println("<head><title>Hello Servlet</title></head>");
    out.println("<body>");
    out.println("<h1>Hello saya dari Servlet Halo Controller !!!</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
