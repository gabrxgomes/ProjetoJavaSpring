package com.sougab.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sougab.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
