package com.mohaiminur.userservices.repository;

import com.mohaiminur.userservices.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository {
    List<User> getAllUsers();
    User getUserById(Long id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
