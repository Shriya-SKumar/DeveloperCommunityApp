package com.cg.dca.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.dca.exception.UnknownDeveloperException;
import com.cg.dca.exception.UnknownFeedException;
import com.cg.dca.entity.Feed;
import com.cg.dca.repository.IFeedRepository;



@Service
public class IFeedService {
	@Autowired
	IFeedRepository repo;
	
public  Feed addFeed(Feed feed)
{
	 repo.save(feed);
	 return feed;

}
public List<Feed>editFeed(Feed feed)
{
	
	int id=feed.getFeedId();
	Supplier s1= ()->new ResourceNotFoundException("Feed Does not exist in the database");
Feed feed1=repo.findById(id).orElseThrow();
	feed.setKeyword(feed.getKeyword());
	repo.save(feed);
	return (List<Feed>) feed1;
}


 public Feed likeFeed(int feedId) throws UnknownFeedException { 
	 
	 Feed feed=repo.getById(feedId);
	 int c=feed.getRelevance();
	 //System.out.println(c);
	 feed.setRelevance(c+1);
	 
	 //System.out.println(feed.getRelevance());
	 return feed; 
	  
	  } 
  
public  Feed getFeed(int feedId) throws UnknownFeedException {
	Feed feed=repo.getById(feedId);
	return feed ;
	
	  
  
  }
 
 public Feed removeFeed(int feedId) throws UnknownFeedException {
Feed feed=repo.getById(feedId);
		repo.deleteById(feedId);
		return feed;
		
 }
 public Feed deleteFeed(Feed feed) {
	 int id=feed.getFeedId();
	 Feed feed1=repo.getById(id);	
		repo.delete(feed);
		return feed1;
	}

	 public List<Feed>getFeedsByDeveloper(int devId)throws UnknownDeveloperException {
		
		 Feed f=repo.findById(devId).orElseThrow();
		 List<Feed> feed= new ArrayList<>() ;
		 feed.add(f);
		return feed;
		
		 
	 }

		
		  public List<Feed>getFeedsByKeyword(String keyword)
		  { 
			  if(keyword!=null)
			  {
		  return repo.findByKeyword(keyword); 
		  } 
			  return repo.findAll(); 
			  }
		 
	  public List<Feed>getFeedsByTopic(String topic) {
	  List<Feed>lfeed1=repo.findByTopic(topic); 
	  return lfeed1; 
	  }
	 
}


