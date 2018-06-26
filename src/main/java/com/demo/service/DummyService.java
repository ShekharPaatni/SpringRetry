package com.demo.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;

@Service
public class DummyService {
    static int count =0;
    @Retryable(value = {HttpClientErrorException.class, HttpServerErrorException.class, NullPointerException.class},
    maxAttempts = 4, backoff = @Backoff(2000))
    public void getDummyService() {
        count++;
        System.out.println("Attempts " + count);
        throw new NullPointerException();
    }

    @Recover
    public void recover(HttpStatusCodeException e) {
        System.out.println("Error in getting http");
    }

    @Recover
    public void recover(NullPointerException e) {
        System.out.println("Null pointer Exception");
    }


}
