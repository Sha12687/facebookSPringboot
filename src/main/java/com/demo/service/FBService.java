package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repo.FBRepo;
@Service
public class FBService {
@Autowired
FBRepo fbRepo;
  public void addUser( User u) {
	  fbRepo.save(u);
  }
}
