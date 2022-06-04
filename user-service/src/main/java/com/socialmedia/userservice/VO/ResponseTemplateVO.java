package com.socialmedia.userservice.VO;

import com.socialmedia.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private List<Post> posts;
}
