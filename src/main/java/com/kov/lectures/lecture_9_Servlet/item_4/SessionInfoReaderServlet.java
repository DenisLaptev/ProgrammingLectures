package com.kov.lectures.lecture_9_Servlet.item_4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class SessionInfoReaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        String oldSessionValue = null;
        String newSessionValue = null;

        if (session != null) {
            newSessionValue = (String) session.getAttribute("newSession");
            oldSessionValue = (String) session.getAttribute("oldSession");
        }

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello SessionInfoReaderServlet</h1>");
        out.println("<h2>oldSessionValue = " + oldSessionValue + "</h1>");
        out.println("<h2>newSessionValue = " + newSessionValue + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
