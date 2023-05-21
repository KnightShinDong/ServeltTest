package com.sdh.ex;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

//@WebListener
public class ServletL implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }
}
