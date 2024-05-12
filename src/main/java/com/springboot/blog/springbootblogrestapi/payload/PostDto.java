package com.springboot.blog.springbootblogrestapi.payload;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;
@Data

public class PostDto {
    private long id;
    @Schema(
            description = "Blog Post Title"
    )
    //title should not be null or empty
    //title should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    //Post Description should not be null or empty
    //Post Description should have at least 10 characters
    @Schema(
            description = "Blog Post Description"
    )
    @NotEmpty
    @Size(min = 10, message = "Post Description should have at least 10 characters")
    private String description;
    @Schema(
            description = "Blog Post Content"
    )
    // Post content should not be null or empty
    private String content;
    private Set<CommentDto> comments;
    @Schema(
            description = "Blog Post Category"
    )
    private Long categoryId;
}
