package com.ProvaNeki.demo.Repositorio;

import com.ProvaNeki.demo.Entidade.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
        User findByUsername(String username);
}
