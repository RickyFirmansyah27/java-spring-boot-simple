package com.myapp.simple.model.Repository;

import com.myapp.simple.model.Entity.User;

import java.util.List;

public interface UserFilter {
    List<User> findUserByCriteria(String name, String email, Integer id, int page, int size);
}
