package com.cg.dca.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.dca.entity.Developer;
import com.cg.dca.entity.Feed;
import com.cg.dca.entity.Response;
import com.cg.dca.entity.User;
import com.cg.dca.repository.IDeveloperRepository;
import com.cg.dca.repository.IFeedRepository;


@SpringBootTest
class IFeedServiceTest {
	@Autowired
	IFeedService feedservice;
	
	@MockBean
	IFeedRepository repo;
	
	@Test
	void testAddFeed() {
		Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		Developer d1=new Developer();
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		f.add(f2);
		f.add(f1);
		User u1=new User();
		f1.setFeedId(0);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		
		
		
	Mockito.when(repo.save(f1)).thenReturn(f1);
		
		assertThat(feedservice.addFeed(f1)).isEqualTo(f1);
	}

		
	@Test
	void testEditFeed() {
		Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		f.add(f2);
		f.add(f1);
		User u1=new User();
		f1.setFeedId(0);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		Optional<Feed> c2=Optional.of(f1);
		Mockito.when(repo.findById(1)).thenReturn(c2);
		
		Mockito.when(repo.save(f1)).thenReturn(f1);
		f1.setTopic("react");
		f1.setQuery("select");
		
		assertThat(feedservice.addFeed(f1)).isEqualTo(f1);
	}

	
	
	//  @Test void testLikeFeed() { fail("Not yet implemented"); }
	  
	
	  @Test void testGetFeed() throws Throwable 
	  { 
		  Feed f0=new Feed(); 
		  Feed f1=new Feed(); 
		  Feed f2= new Feed(); 
		  Developer d1=new Developer(); 
		  Response r1=new Response(); 
		  List<Feed> f= new ArrayList<>(); 
		  List<Response> r= new ArrayList<>(); 
		  Response r2=new Response(); 
		  r.add(r2); 
		  r.add(r1); 
		  f.add(f2);
	  f.add(f1); 
	  User u1=new User(); 
	  f1.setFeedId(1); 
	  f1.setFeedDate(null);
	  f1.setFeedTime(null); 
	  f1.setTotalComments(0); 
	  f1.setQuery("abc");
	  f1.setTopic("cloud"); 
	  f1.setRelevance(0); 
	  f1.setResponses(r); 
	  Optional<Feed>c2=Optional.of(f1); 
	  Mockito.when(repo.getById(1)).thenReturn(f1);
	 
	  assertThat(feedservice.getFeed(1)).isEqualTo(f1);
	  }
	  
	  
	 

	  

  @Test void testRemoveFeed() {
	  Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		Developer d1=new Developer();
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		f.add(f2);
		f.add(f1);
		User u1=new User();
		f1.setFeedId(1);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		Optional<Feed> c2=Optional.of(f1);
		
		Mockito.when(repo.findById(1)).thenReturn(c2);
		 Mockito.when(repo.existsById(f1.getFeedId())).thenReturn(false);
		   assertFalse(repo.existsById(f1.getFeedId()));
	}
  
  
  
  @Test void testDeleteFeed() {
	  Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		Developer d1=new Developer();
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		f.add(f2);
		f.add(f1);
		User u1=new User();
		f1.setFeedId(1);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		Optional<Feed> c2=Optional.of(f1);
		
		Mockito.when(repo.findById(1)).thenReturn(c2);
		 Mockito.when(repo.existsById(f1.getFeedId())).thenReturn(false);
		   assertFalse(repo.existsById(f1.getFeedId()));
	}


	  

  @Test void testGetFeedsByDeveloper()   throws Throwable {
	  Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		Developer d1=new Developer();
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		
		
		
		User u1=new User();
		f1.setFeedId(1);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		f.add(f1);
			Optional<Feed> c2 = Optional.of(f1);

			Mockito.when(repo.findById(1)).thenReturn(c2);

			assertThat(feedservice.getFeedsByDeveloper(1)).isEqualTo(f);
		}
 

  

  @Test void testGetFeedsByKeyword() 
  { 
	  Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		Developer d1=new Developer();
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		
		
		
		User u1=new User();
		f1.setFeedId(1);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		f1.setKeyword("chicken");
		f.add(f1);
			Optional<Feed> c2 = Optional.of(f1);

			Mockito.when(repo.findByKeyword("chicken")).thenReturn(f);

			assertThat(feedservice.getFeedsByKeyword("chicken")).isEqualTo(f); 
  }
	  
  
  
  @Test void testGetFeedsByTopic() 
  { 
	  Feed f0=new Feed();
		Feed f1=new Feed();
		Feed f2= new Feed();
		Developer d1=new Developer();
		Response r1=new Response();
		List<Feed> f= new ArrayList<>();
		List<Response> r= new ArrayList<>();
		Response r2=new Response();
		r.add(r2);
		r.add(r1);
		
		
		
		User u1=new User();
		f1.setFeedId(1);
		f1.setFeedDate(null);
		f1.setFeedTime(null);
		f1.setTotalComments(0);
		f1.setQuery("abc");
		f1.setTopic("cloud");
		f1.setRelevance(0);
		f1.setResponses(r);
		
		f.add(f1);
			Optional<Feed> c2 = Optional.of(f1);

			Mockito.when(repo.findByTopic("cloud")).thenReturn(f);

			assertThat(feedservice.getFeedsByTopic("cloud")).isEqualTo(f);  
  }
  }
  
 
 