package com.ram.practice.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
public class AsyncService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);
    @Async
    public void asyncMethod(){
        logger.info("Async method is executing ... "+Thread.currentThread().getName());
        int i =0;
        for(i=0;i<100;i++){
            if(i==50) {
                try {
                    TimeUnit.SECONDS.sleep(5); //simulating running task
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        logger.info("Async method is completed .."+i);
    }

    @Async("asyncTaskExecutor")
    public CompletableFuture<String> fetchData(){
        logger.info("Async method is executing ... "+Thread.currentThread().getName());
        int i =0;
        for(i=0;i<100;i++){
            if(i==50) {
                try {
                    TimeUnit.SECONDS.sleep(5); //simulating running task
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        logger.info("Async method is completed .."+i);
        return CompletableFuture.completedFuture("Data fetched Successfully");
    }
}
