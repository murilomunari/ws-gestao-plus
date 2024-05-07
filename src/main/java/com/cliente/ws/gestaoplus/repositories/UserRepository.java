package com.cliente.ws.gestaoplus.repositories;

import com.cliente.ws.gestaoplus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
