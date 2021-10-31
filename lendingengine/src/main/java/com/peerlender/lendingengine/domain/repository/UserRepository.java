package com.peerlender.lendingengine.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peerlender.lendingengine.domain.model.User;

public interface UserRepository extends JpaRepository<User,String> {

}
