package com.kov.lectures.lecture_9_Servlet.item_12;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session was created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session was destroyed");
    }
}
