package ejerciciotelegrambot.service;


import ejerciciotelegrambot.model.User;
import ejerciciotelegrambot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public User findUserById(int userId) {
        return repository.findById(userId+'L');
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> findUserByLastName(String lastname) {
        return repository.findByLastName(lastname);
    }
}
