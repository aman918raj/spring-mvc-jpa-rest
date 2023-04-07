package com.example.springmvcjparest.repository;

import com.example.springmvcjparest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByFirstnameAndLastname(String firstname, String lastname);

    @Query("Select usr from users usr where usr.age > ?1")
    public List<User> findUsersAgeGreaterThan(int age);
}
