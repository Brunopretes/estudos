package desafio.java.santander.service.impl;

import desafio.java.santander.model.User;
import desafio.java.santander.model.repository.UserRepository;
import desafio.java.santander.service.impl.UserService;


import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;


import desafio.java.santander.service.impl.*;

@SuppressWarnings("unused")
@Service  

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}