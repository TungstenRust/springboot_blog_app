package com.springboot.blog.springbootblogrestapi.payload;

import java.util.Set;

public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;
}
