package com.guanyu.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guanyu
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UniteBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniteBookApplication.class, args);
    }

}
