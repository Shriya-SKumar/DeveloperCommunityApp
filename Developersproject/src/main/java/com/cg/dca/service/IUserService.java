package com.cg.dca.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dca.exception.UserNotFoundException;
import com.cg.dca.entity.User;
import com.cg.dca.repository.IUserRepository;
@Service
public class IUserService {
	 @Autowired 
	  IUserRepository repo;
	 public User login(User users) throws UserNotFoundException
	 {
		 int id=users.getUserId();
		User c=repo.findByUserId(id);
		if (c == null) {
            throw new UserNotFoundException(Integer.toString(id));
        }
 
		return users;
		 
	 }
	 public User logOut(User users)
	 {
		return users;		 
	 }

}

