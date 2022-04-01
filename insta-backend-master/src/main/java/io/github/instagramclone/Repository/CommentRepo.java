package io.github.instagramclone.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.github.instagramclone.Entity.Comments;

@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer> {
	
	Comments save(Comments comment);
	ArrayList<Comments> findAllByPostId(String postId);
	ArrayList<Comments> findAll();
}
