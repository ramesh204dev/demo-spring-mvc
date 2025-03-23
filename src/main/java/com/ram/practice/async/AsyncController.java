package com.ram.practice.async;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/async")
public class AsyncController {
    private final AsyncService asyncService;

    public AsyncController(AsyncService asyncService){
        this.asyncService=asyncService;
    }

    @GetMapping("/runAsync")
    public String triggerAsyncMethod(){
        asyncService.asyncMethod();
        return "Async Method is called ";
    }


    @GetMapping("/fetchAsyncData")
    public CompletableFuture<String> triggerAsyncFetchMethod(){

        return  asyncService.fetchData();
    }
}
