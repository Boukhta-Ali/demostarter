package com.example.demostarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demostarter.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
