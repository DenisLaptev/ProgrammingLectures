package com.kov.lectures.lecture_9_Servlet.item_11;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context is initialised");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context is destroyed");
    }
}
