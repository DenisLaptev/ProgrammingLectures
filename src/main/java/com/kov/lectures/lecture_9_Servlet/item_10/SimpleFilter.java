package com.kov.lectures.lecture_9_Servlet.item_10;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init Filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Do Filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
}
