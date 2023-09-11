package com.test.service.client;

import com.test.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackClient implements UserClient{

    @Override
    public User findUserById(int uid) {
        User user = new User();
        user.setName("FallbackUser");
        return user;
    }
}
