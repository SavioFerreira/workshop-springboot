package com.savi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
