package com.epam.spring.core.loggers;


/**
 * Created by Maksym_Hromyk on 12.07.2018.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg){
        System.out.println(msg);
    }
}
