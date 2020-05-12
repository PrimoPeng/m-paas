package com.taoding.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.taoding.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * BookServiceImpl
 *
 * @author primo
 * @date 2019/11/14
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "reliable")
    @Override
    public String readingList() {
        URI uri = URI.create("http://USER-CENTER/index");
        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reliable() {
        return "Cloud Native Java (O'Reilly)";
    }

}
