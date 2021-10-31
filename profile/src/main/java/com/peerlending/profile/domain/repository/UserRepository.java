package com.peerlending.profile.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peerlending.profile.domain.model.User;

public interface UserRepository extends JpaRepository<User,String> {

}
