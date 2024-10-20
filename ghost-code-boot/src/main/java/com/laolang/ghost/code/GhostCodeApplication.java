package com.laolang.ghost.code;

import com.yomahub.tlog.core.enhance.bytes.AspectLogEnhance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class GhostCodeApplication {

    static {
        AspectLogEnhance.enhance();
    }

    public static void main(String[] args) {
        SpringApplication.run(GhostCodeApplication.class, args);
        log.info("ghost code is running...");
    }
}
