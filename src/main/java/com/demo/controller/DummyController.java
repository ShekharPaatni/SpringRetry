package com.demo.controller;

import com.demo.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class DummyController {

    @Autowired
    DummyService dummyService;
    @Retryable(value = {HttpClientErrorException.class, HttpServerErrorException.class},
    maxAttempts = 2, backoff = @Backoff(2000))
    @RequestMapping("/test")
    public void getResult() {
        dummyService.getDummyService();
    }

}