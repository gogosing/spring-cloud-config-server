package me.gogosing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by JinBum Jeong on 2020/02/22.
 */
@EnableConfigServer
@SpringBootApplication
public class ApplicationInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInitializer.class, args);
    }
}
