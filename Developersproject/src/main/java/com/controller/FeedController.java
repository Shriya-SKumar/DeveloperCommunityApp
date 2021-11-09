package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dca.entity.Feed;
import com.cg.dca.service.IFeedService;
@RestController
@RequestMapping(path="/api")

public class FeedController {
	@Autowired
	IFeedService feedservice;
	
@PostMapping("/addFeed")	
public ResponseEntity<Feed>addFeed(@RequestBody Feed feed)
{
  Feed feed1=feedservice.addFeed(feed);
  ResponseEntity re=new
  ResponseEntity<Feed>(feed1,HttpStatus.OK);
  
return re;
}
@DeleteMapping("/editFeed")
public ResponseEntity<Feed>editFeed(Feed feed)
{
	Feed feed1=(Feed) feedservice.editFeed(feed) ;
	ResponseEntity re=new
			ResponseEntity<Feed>(feed1,HttpStatus.OK);
	return re;
	
}


  @GetMapping("/getFeedsBykeyword") 
  public ResponseEntity<List<Feed>>getFeedsBykeyword(String keyword) 
  { 
	 
  List<Feed>lfeed1=feedservice.getFeedsByKeyword(keyword);
  ResponseEntity re=new ResponseEntity<List<Feed>>(lfeed1,HttpStatus.OK);
  return re;
  
  }
 

  @GetMapping("/getFeedsByTopic") 
  public ResponseEntity<List<Feed>>getFeedsByTopic(String topic) 
  { 
	 
  List<Feed>lfeed1=feedservice.getFeedsByTopic(topic); 
  ResponseEntity re=new ResponseEntity<List<Feed>>(lfeed1,HttpStatus.OK); return re; }
  
 	
}

