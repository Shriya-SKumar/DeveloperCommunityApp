package com.cg.dca.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.model.Developer;
import com.cg.dca.entity.User;
@Repository
public interface IUserRepository extends JpaRepository<User,String> {
	
	User findByUserId(int id);


}

