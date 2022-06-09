package com.socialmedia.userservice.service;

import com.socialmedia.userservice.FBRestClient;
import com.socialmedia.userservice.VO.Post;
import com.socialmedia.userservice.VO.ResponseTemplateVO;
import com.socialmedia.userservice.entity.User;
import com.socialmedia.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FBRestClient fbRestClient;

    public User saveUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithPosts(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findById(userId).get();
        vo.setUser(user);

        List<Post> posts = fbRestClient.getApi("http://POST-SERVICE/posts/foruser/" + userId, HttpMethod.GET);
        vo.setPosts(posts);
        return vo;
    }
}
