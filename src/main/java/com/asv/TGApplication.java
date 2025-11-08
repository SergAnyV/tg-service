package com.asv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class TGApplication {
    public static void main(String[] args) {

        SpringApplication.run(TGApplication.class);

    }
}