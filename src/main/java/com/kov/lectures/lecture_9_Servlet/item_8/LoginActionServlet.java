package com.kov.lectures.lecture_9_Servlet.item_8;

import com.kov.lectures.lecture_9_Servlet.beans.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class LoginActionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello LoginAction with doGet method</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        /*вызов сервиса и проверка наличия юзера в БД*/

        User user = new User("Anton", "Kovalenko", "admin", "admin123", "man"); // достаем пользователя с БД


        if (user.getLogin().equals(username) && user.getPassword().equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            req.getRequestDispatcher("/resources/jsp/home.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/resources/jsp/notAuth.jsp").forward(req, resp);
        }

    }
}
