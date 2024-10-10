package com.test.userserviceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.userserviceapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
