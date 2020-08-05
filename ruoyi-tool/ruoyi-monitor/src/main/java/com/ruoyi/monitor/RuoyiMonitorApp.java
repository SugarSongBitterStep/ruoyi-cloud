package com.ruoyi.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class RuoyiMonitorApp {
    public static void main(String[] args) {
        SpringApplication.run(RuoyiMonitorApp.class, args);
    }
}