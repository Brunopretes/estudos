package desafio.java.santander.service.impl;

import desafio.java.santander.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
    