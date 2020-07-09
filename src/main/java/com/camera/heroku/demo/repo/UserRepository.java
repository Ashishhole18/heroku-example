package com.camera.heroku.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camera.heroku.demo.entity.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
