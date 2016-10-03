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
public class CookieWriterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        Cookie loginCookie = new Cookie("login", "devil");
        Cookie pwdCookie = new Cookie("pwd", "666");

        loginCookie.setMaxAge(20); //1 hour
        resp.addCookie(loginCookie);
        resp.addCookie(pwdCookie);

        pw.println("Cookies created");
    }
}
