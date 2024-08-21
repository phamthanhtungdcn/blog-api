package com.springboot.blog.controller;

import com.springboot.blog.payload.BlogResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

//    @PostMapping(value = {"/login", "/signin"})
//    public MyBlogResponseDto login(@RequestBody LoginDto loginDto) {
//        String token = authService.login(loginDto);
//
//        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
//        jwtAuthResponse.setAccessToken(token);
//
//        ResponseDto responseDto = ResponseDto.builder()
//                .data(jwtAuthResponse).build();
//        return responseDto;
//    }

    @GetMapping("/home")
    public BlogResponse home(){
        BlogResponse response = BlogResponse.builder().data("Hello World").build();
        return response;
    }
}
