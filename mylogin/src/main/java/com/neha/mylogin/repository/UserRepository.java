package com.neha.mylogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.mylogin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
