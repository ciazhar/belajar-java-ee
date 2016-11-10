package com.web.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class GetParameterValuesServlet extends HttpServlet {
/** Handles the HTTP <code>POST</code> method.
* @param request servlet request
* @param response servlet response
*/
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String paramValues[] = request.getParameterValues("sports");
    StringBuffer myResponse = new StringBuffer();

    myResponse.append("<html>");
    myResponse.append("<head><title>Your Choices</title></head>");
    myResponse.append("<body>");
    myResponse.append("<h1>Your choices were: </h1>");
    myResponse.append("<ul>");
    for (int i = 0; i < paramValues.length; i++) {
      myResponse.append("<li>"+ paramValues[i] +"</li>");
    }
    myResponse.append("</ul>");
    myResponse.append("</body>");
    myResponse.append("</html>");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(myResponse.toString());
  }
}
