package com.example;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDistributedTransaction
public class TXCDemoDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TXCDemoDubboClientApplication.class, args);
    }

}

