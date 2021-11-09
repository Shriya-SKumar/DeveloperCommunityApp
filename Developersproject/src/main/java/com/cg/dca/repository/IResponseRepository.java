package com.cg.dca.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.dca.entity.Response;
@Repository
public interface IResponseRepository extends JpaRepository<Response,Integer>{
	
}
