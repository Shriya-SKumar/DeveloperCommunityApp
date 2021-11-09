
  package com.cg.dca.repository; 
  import java.util.List;

  import org.springframework.data.jpa.repository.JpaRepository;
  import org.springframework.data.jpa.repository.Query;
  import org.springframework.stereotype.Repository;

  import com.cg.dca.entity.Feed;
import com.cg.dca.exception.UnknownDeveloperException;
import com.cg.dca.exception.UnknownFeedException;
  @Repository
  public interface IFeedRepository extends JpaRepository<Feed,Integer>{

	List<Feed> findByTopic(String topic);

	//List<Feed> search(String keyword);

	List<Feed> findByKeyword(String keyword);
  	
	
	
	 
  	
  	

  }