package com.kov.lectures.lecture_9_Servlet.item_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
//@WebServlet({"/test1"}) // annotation example
public class MySimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("test", "helloTest");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Hello MySimsetyheryjpleServlet</h3>");
        out.println("</body>");
        out.println("</html>");

//        out.close(); // ����� �������� ������, ���������� ������ ��������� ����������

//        request.getRequestDispatcher("/help").include(request, response);
//        request.getRequestDispatcher("/help").forward(request, response);

        response.sendRedirect("/help");

    }
}
