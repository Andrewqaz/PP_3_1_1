package crudapp.service;

import crudapp.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(User user);

}
