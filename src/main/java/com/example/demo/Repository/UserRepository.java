package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	@Query("SELECT u from User u Where u.username= :username")
	public User getUserByUsername(@Param("username") String username);
}
