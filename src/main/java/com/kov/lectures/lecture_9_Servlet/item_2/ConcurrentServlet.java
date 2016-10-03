package com.kov.lectures.lecture_9_Servlet.item_2;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class ConcurrentServlet extends HttpServlet {
    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ++count;
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello ConcurrentServlet</h1>");
        out.println("<h2> count = " + count + "</h2>");
        sleep(out);
        out.println("</body>");
        out.println("</html>");
    }

    private synchronized void sleep(PrintWriter out) {
        try {
            out.println("<h3> Thread Name = " + Thread.currentThread().getName() + "</h3>");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
