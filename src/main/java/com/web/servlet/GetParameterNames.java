package com.web.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class GetParameterNames extends HttpServlet{
  protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    String ServerName = request.getServerName();
    int ServerPort = request.getServerPort();
    String ContextPath = request.getContextPath();
    String GetPath = request.getPathInfo();
    String QueryString = request.getQueryString();

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>GetParameterNames</title></head>");
    out.println("<body>");
    out.println("ServerPort : "+ServerPort+"</br>");
    out.println("ServerName : "+ServerName+"</br>");
    out.println("ContextPath : "+ContextPath+"</br>");
    out.println("GetPath : "+GetPath+"</br>");
    out.println("QueryString : "+QueryString+"</br>");
    out.println("</body>");
    out.println("</html>");
  }
}
