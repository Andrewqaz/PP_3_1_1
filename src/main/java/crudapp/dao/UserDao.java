package crudapp.dao;

import crudapp.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(User user);
}
