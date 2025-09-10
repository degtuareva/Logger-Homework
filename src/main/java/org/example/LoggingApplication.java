package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingApplication.class);

    public static void loggerDemo() {
        LOGGER.debug("test 1 - debug level");
        LOGGER.info("test 2 - info level");
        LOGGER.warn("test 3 - warning level");
    }

    public static void main(String[] args) {
        SpringApplication.run(LoggingApplication.class, args);
        loggerDemo();
    }
}
