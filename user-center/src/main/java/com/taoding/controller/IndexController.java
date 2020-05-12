package com.taoding.controller;

import com.taoding.entity.Blog;
import com.taoding.mapper.BlogMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * IndexController
 *
 * @author primo
 * @date 2019/11/12
 */
@RestController
@RequestMapping("/")
public class IndexController {

    private Logger log = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private BlogMapper blogMapper;

    @GetMapping(value = "/index")
    public void index(){
        //List<Blog> blogs = blogMapper.getAllBlog();
        List<Blog> blogs =  blogMapper.selectAll();
        for (Blog blog : blogs)  {
            log.info("id === >" + blog.getId());
            log.info("title === >" + blog.getTitle());
            log.info("content === >" + blog.getContent());
        }
    }
}
