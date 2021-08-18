package com.ProvaNeki.demo.Servicos;


import com.ProvaNeki.demo.Entidade.User;
import com.ProvaNeki.demo.Repositorio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }



}
