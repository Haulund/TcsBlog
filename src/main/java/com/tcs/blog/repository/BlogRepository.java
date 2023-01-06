package com.tcs.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.blog.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Integer>{
    
}
