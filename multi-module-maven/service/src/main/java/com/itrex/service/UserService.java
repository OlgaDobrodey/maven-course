package com.itrex.service;

import com.itrex.dao.UserDao;
import com.itrex.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id)
                .map(it->new UserDto());

    }
}
