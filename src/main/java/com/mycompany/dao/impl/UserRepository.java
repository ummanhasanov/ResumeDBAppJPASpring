package com.mycompany.dao.impl;

import com.mycompany.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom {
    User findByName(String name);

    List<User> findByNameAndSurname(String name, String surname);

    @Query(value = "select u from User u where u.email=?1")
    User findByEmail(String email);

}
