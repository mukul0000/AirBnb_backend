package com.air.demo.user.serviceImpl;

import com.air.demo.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String aboutUser() {
        return "yes its user";
    }
}
