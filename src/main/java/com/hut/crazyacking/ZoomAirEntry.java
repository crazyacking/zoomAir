package com.hut.crazyacking;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZoomAirEntry {

    private static Logger logger = Logger.getLogger(ZoomAirEntry.class);

    public static void main(String[] args) {
        SpringApplication.run(ZoomAirEntry.class, args);
    }
}
