package com.OnlineShopping.website.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineShopping.website.Entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{

}
