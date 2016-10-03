package com.kov.lectures.lecture_9_Servlet.item_7;

import com.kov.lectures.lecture_9_Servlet.beans.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class JSTLExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        users.add(new User(1, 20, "Pety"));
        users.add(new User(2, 25, "Sasha"));
        users.add(new User(3, 30, "Vasy"));
        users.add(new User(4, 35, "Katy"));
        users.add(new User(6, 56, "tEST"));

        req.getSession().setAttribute("users", users);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/resources/jsp/users.jsp");
        rd.forward(req, resp);
    }
}
