package dev.francieles.service;

import dev.francieles.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}