package com.ram.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {
    //Default Executor is SimpleAsyncTaskExecutor
    //Customer ThreadPoolTaskExecutor

    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    @Bean(name = "asyncTaskExecutor")
    public Executor asyncConfig(){
        executor.setCorePoolSize(5);  // Minimum number of threads always available
        executor.setMaxPoolSize(10);  // Maximum number of threads allowed
        executor.setQueueCapacity(100);  // Tasks that wait when core threads are ful
        executor.setThreadNamePrefix("Async Thread -");
        executor.initialize();
        return executor;
    }
}
