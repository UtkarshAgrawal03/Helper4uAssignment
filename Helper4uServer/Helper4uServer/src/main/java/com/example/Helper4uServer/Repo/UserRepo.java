package com.example.Helper4uServer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Helper4uServer.Entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
