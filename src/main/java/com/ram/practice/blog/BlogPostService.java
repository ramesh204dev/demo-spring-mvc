package com.ram.practice.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    private static final Logger logger  = LoggerFactory.getLogger(BlogPostService.class);
    private final  BlogPostRepository blogPostRepository;
    public BlogPostService(BlogPostRepository blogPostRepository){
        this.blogPostRepository=blogPostRepository;
    }

    public List<BlogPost> findAllPostsByTitle(String keyword){
        return blogPostRepository.findByTitleContaining(keyword);
    }
}
