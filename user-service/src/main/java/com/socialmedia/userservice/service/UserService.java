package com.socialmedia.userservice.service;

import com.socialmedia.userservice.VO.ResponseTemplateVO;
import com.socialmedia.userservice.entity.User;
import com.socialmedia.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithPosts(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findById(userId).get();
        vo.setUser(user);

        restTemplate.getFor


    }
}
