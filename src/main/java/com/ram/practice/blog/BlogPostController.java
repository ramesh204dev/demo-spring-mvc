package com.ram.practice.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogPostController {

    private final  BlogPostService blogPostService;
    public BlogPostController(BlogPostService blogPostService){
        this.blogPostService=blogPostService;
    }

    @GetMapping("/search")
    public List<BlogPost> search(@RequestParam String keyword){
    return  blogPostService.findAllPostsByTitle(keyword);
    }
}
