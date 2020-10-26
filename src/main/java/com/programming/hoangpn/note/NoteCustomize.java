package com.programming.hoangpn.note;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableCaching
public class NoteCustomize {

    public static void main(String[] args) {
        SpringApplication.run(NoteCustomize.class, args);
    }
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("login"); // Cache Vendor
    }
}
