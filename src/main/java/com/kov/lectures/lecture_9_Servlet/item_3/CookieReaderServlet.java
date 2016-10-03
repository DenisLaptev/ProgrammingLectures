package com.kov.lectures.lecture_9_Servlet.item_3;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class  CookieReaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();

        String loginCookie = null;
        String pwdCookie = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();

                if (name.equals("login")) {
                    loginCookie = value;
                }
                if (name.equals("pwd")) {
                    pwdCookie = value;
                }
            }
        }

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello CookieReaderServlet</h1>");
        out.println("<h2> login is " + loginCookie + "</h2>");
        out.println("<h2> password is " + pwdCookie + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
