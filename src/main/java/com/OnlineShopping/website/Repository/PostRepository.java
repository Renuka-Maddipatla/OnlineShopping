package com.OnlineShopping.website.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineShopping.website.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
