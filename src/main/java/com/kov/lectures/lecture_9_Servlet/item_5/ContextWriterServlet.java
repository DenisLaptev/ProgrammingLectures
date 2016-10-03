package com.kov.lectures.lecture_9_Servlet.item_5;

import com.kov.lectures.lecture_9_Servlet.helper.TimeCreator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class ContextWriterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        String time = TimeCreator.getTime();
        servletContext.setAttribute("time", time);

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello ServletContextEx</h1>");
        out.println("<h2>Set up common info " + time + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
