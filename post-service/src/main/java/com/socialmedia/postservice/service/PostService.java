package com.socialmedia.postservice.service;

import com.socialmedia.postservice.entity.Post;
import com.socialmedia.postservice.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public Post savePost(Post post) {
        log.info("PostService.savePost");
        return postRepository.save(post);
    }

    public Post findPostByPostId(Long postId) {
        log.info("PostService.findPostByPostId");
        return postRepository.findByPostId(postId);
    }

    public List<Post> findAllPosts() {
        log.info("PostService.findAllPosts");
        return postRepository.findAll();
    }

    public boolean deletePostByPostId(Long postId) {
        log.info("PostService.deletePostByPostId");
        postRepository.deleteById(postId);
        return true;
    }
}
