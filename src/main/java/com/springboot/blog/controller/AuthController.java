package com.springboot.blog.controller;

import com.springboot.blog.payload.BlogResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/home")
    public BlogResponse home(){
        BlogResponse response = BlogResponse.builder().data("Hello World").build();
        return response;
    }
}
