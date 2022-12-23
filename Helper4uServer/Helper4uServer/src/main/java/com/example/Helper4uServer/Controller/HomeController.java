package com.example.Helper4uServer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Helper4uServer.Entity.User;
import com.example.Helper4uServer.Service.UserService;

@RestController
public class HomeController {
	@Autowired
	UserService us;
	
	@PostMapping("/add")
	@CrossOrigin("*")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(us.add(user),HttpStatus.OK);
	}
	@GetMapping("/prime/{x}")
	public ResponseEntity<List<Integer>> getPrimes(@PathVariable int x){
		return new ResponseEntity<>(us.prime(x),HttpStatus.OK);
	}
	

}
