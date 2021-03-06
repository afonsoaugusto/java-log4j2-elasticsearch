package com.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class App {
    private static final Logger logger = LogManager.getLogger("metabase");
    public static void main(String[] args) {
        System.out.println("Te");
        logger.info("Hello, World info!");
        logger.debug("Hello, World debug!");
        logger.error("Hello, World error!");
        logger.fatal("Hello, World fatal!");
        try {
            throw new Exception("message", new Throwable("message"));
            // int b = 5 / 0;
            // throw new Exception("Exception message");
        } catch (Exception e) {
            logger.error(e,e);
        }
    }
}