package com.spring.security.service;

import com.spring.security.model.User;
import com.spring.security.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository repository;
    private PasswordEncoder encoder;

    public void createUser(User user){
        String pass = user.getPassword();
        // Criptografando antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}
