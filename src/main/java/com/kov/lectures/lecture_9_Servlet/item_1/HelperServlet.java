package com.kov.lectures.lecture_9_Servlet.item_1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class HelperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object test = req.getAttribute("test");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Hello from helper servlet " + test + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
