package com.itSolution.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itSolution.entity.Role;
import com.itSolution.entity.User;
import com.itSolution.repo.RoleRepo;
import com.itSolution.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;
	
	public void saveUser() {
		
		Role r1=new Role();
		r1.setRoleName("Admin");
		
		Role r2=new Role();
		r2.setRoleName("Manager");
		
		User u=new User();
		u.setUname("Sandeep Kumar");
		u.setGender("Male");
		
		u.setRoles(Arrays.asList(r1,r2));
		
		userRepo.save(u);
		
		
		
		
		
		
		
	}

}
