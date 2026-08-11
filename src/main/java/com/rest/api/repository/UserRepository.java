package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
