package com.epam.spring.core;

import com.epam.spring.core.beans.Client;
import com.epam.spring.core.loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Maksym_Hromyk on 12.07.2018.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public App(Client cl, EventLogger el){
        this.client = cl;
        this.eventLogger = el;
    }

    public void logEvent(String msg){
        String message = msg.replaceAll(String.valueOf(client.getId()),client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String args[]){
      //  App app = new App();

       // app.client = new com.epam.spring.core.beans.Client(1,"John Smith");
        //app.evenLogger = new com.epam.spring.core.loggers.ConsoleEventLogger();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("src/main/resources/spring.xml");

        App app = (App) ((ClassPathXmlApplicationContext) ctx).getBean("app");
        app.logEvent("Some event for user 1");

    }



}
