package com.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
//import javax.servlet.Annotation.WebServlet;
import java.io.*;

public class JPEGOutputServlet extends HttpServlet {
  /*public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    byte bufferArray[] = new byte[1024];
    response.setContentType("image/gif");
    InputStream is = getServletContext().getResource("/WEB-INF/images/proglanguages.jpg").openStream();
    int read = is.read(bufferArray);
    while (read != -1) {
      response.getOutputStream().write(bufferArray);
      read = is.read(bufferArray);
    }
    is.close();
    os.close();
  }*/
}
