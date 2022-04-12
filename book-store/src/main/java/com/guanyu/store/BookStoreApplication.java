package com.guanyu.store;

import com.guanyu.provider.book.core.BookClient;
import com.guanyu.store.config.FeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Guanyu
 */
@EnableFeignClients(
        defaultConfiguration = FeignConfiguration.class,
        clients = {
                BookClient.class
        })
@EnableDiscoveryClient
@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

}


