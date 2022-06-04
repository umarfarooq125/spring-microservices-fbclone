package com.socialmedia.postservice.repository;

import com.socialmedia.postservice.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByPostId(Long postId);
}
