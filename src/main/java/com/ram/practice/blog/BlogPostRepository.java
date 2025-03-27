package com.ram.practice.blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
    List<BlogPost> findByTitleContaining(String keyword);
}
