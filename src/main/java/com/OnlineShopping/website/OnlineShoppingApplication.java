package com.OnlineShopping.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.OnlineShopping.website.Entity.Comment;
import com.OnlineShopping.website.Entity.Post;
import com.OnlineShopping.website.Repository.PostRepository;

@SpringBootApplication
public class OnlineShoppingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
	}

	@Autowired
	private PostRepository postrepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("one to many mapping using jpa and hibernate","one to many mapping using jpa and hibernate");
		Comment comment1 = new Comment("very useful");
		Comment comment2 = new Comment("Informative");
		Comment comment3 = new Comment("Great post");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postrepository.save(post);
	}

}
