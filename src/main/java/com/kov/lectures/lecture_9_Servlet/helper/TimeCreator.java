package com.kov.lectures.lecture_9_Servlet.helper;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class TimeCreator {
    public static String getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        String minutes = Integer.toString(calendar.get(Calendar.MINUTE));
        String seconds = Integer.toString(calendar.get(Calendar.SECOND));
        return minutes + ":" + seconds;
    }
}
