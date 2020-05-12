package com.taoding.controller;

import com.taoding.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 *
 * @author primo
 * @date 2019/11/14
 */
@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }
}
