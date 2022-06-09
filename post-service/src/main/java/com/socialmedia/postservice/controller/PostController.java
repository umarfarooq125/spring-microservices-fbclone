package com.socialmedia.postservice.controller;

import com.socialmedia.postservice.entity.Post;
import com.socialmedia.postservice.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@Slf4j
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/")
    public Post savePost(@RequestBody Post post){
        log.info("PostController.savePost");
        return postService.savePost(post);
    }

    @GetMapping("/")
    public List<Post> getAllPosts(){
        log.info("PostController.getAllPosts");
        return postService.findAllPosts();
    }

    @GetMapping("/foruser/{byuserid}")
    public List<Post> getAllPosts(@PathVariable("byuserid") Long userId){
        log.info("PostController.getAllPosts");
        List<Post> posts = postService.findAllPostsByUser(userId);
        return posts;
    }


    @GetMapping("/{id}")
    public Post findPostByPostId(@PathVariable("id") Long postId){
        log.info("PostController.findPostByPostId");
        return postService.findPostByPostId(postId);
    }

    @DeleteMapping("/{id}")
    public boolean deletePostByPostId(@PathVariable("id") Long postId) {
        return postService.deletePostByPostId(postId);
    }
}
