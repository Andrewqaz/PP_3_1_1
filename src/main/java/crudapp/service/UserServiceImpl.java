package crudapp.service;

import crudapp.model.User;
import crudapp.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        User saveUser = repository.saveAndFlush(user);

    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        repository.deleteById(id);
    }

    @Override
    public User getUserById(int id) {
        Optional<User> byId = repository.findById(id);
        return byId.get();
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        repository.saveAndFlush(user);
    }

}
