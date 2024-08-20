package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BlogResponse {

    @Builder.Default
    private boolean isSuccess = true;
    @Builder.Default
    private int statusCode = 200;
    private Object data;
}
