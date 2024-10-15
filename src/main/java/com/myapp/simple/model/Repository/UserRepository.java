package com.myapp.simple.model.Repository;

import com.myapp.simple.model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserFilter {
    // Other query methods if needed
}
