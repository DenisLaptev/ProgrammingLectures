package com.kov.lectures.lecture_9_Servlet.item_4;

import com.kov.lectures.lecture_9_Servlet.helper.TimeCreator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(15);

        if (session.isNew()) {
            session.setAttribute("newSession", TimeCreator.getTime());
        } else {
            session.setAttribute("oldSession", TimeCreator.getTime());
        }
    }
}
