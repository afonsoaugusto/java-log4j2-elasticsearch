package com.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class App {
    private static final Logger logger = LogManager.getLogger("metabase");
    public static void main(String[] args) {
        System.out.println("Te");
        logger.info("Hello, World!");
        logger.debug("Hello, World!");
        logger.error("Hello, World!");
        logger.fatal("Hello, World!");
    }
}