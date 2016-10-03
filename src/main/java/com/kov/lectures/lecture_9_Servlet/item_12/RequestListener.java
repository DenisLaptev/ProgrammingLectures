package com.kov.lectures.lecture_9_Servlet.item_12;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by Kovantonlenko on 12/21/2015.
 */
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Servlet request is destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Servlet request is initialised");
    }
}
