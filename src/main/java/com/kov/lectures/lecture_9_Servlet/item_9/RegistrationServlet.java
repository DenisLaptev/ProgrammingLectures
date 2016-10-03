package com.kov.lectures.lecture_9_Servlet.item_9;

import com.kov.lectures.lecture_9_Servlet.beans.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/resources/jsp/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User userBean = (User) req.getSession().getAttribute("userBean");

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String gender = req.getParameter("gender");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        /*валидация всех полей*/

             User user = new User(firstName, lastName, login, password, gender);

        /*сохраняем нашего пользователя*/

        HttpSession session = req.getSession();
        session.setAttribute("user", user);
        req.getRequestDispatcher("/resources/jsp/home.jsp").forward(req, resp);
    }
}
