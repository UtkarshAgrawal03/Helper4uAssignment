package com.example.Helper4uServer.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Helper4uServer.Entity.User;
import com.example.Helper4uServer.Repo.UserRepo;
@Service
public class UserService {
	
	@Autowired
	UserRepo ur;
	public boolean isprime(int x) {
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0)return false;
		}
		return true;
	}
	
	public List<Integer> prime(int x){
		List<Integer> l=new ArrayList<>();
		for(int i=1;i<=x;i++) {
			if(isprime(i)==true)l.add(i);
		}
		return l;
	}
	public User add(User user) {
		return ur.save(user);
	}
	

}
