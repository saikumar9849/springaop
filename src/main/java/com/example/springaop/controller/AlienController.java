package com.example.springaop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springaop.dao.AlienRepo;
import com.example.springaop.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	
	@PostMapping(path="/addAlien",consumes={"application/json"})//consumes is used to accept only specific type of data in this case it accepts only json data
	public Alien addAlien(@RequestBody Alien a) {
		repo.save(a);
		return a;
	}
	
	@PutMapping(path="/addAlien",consumes={"application/json"})//consumes is used to accept only specific type of data in this case it accepts only json data
	public Alien putAlien(@RequestBody Alien a) {
		repo.save(a);
		return a;
	}
	
	@DeleteMapping(path="/addAlien/{id}",consumes={"application/json"})//consumes is used to accept only specific type of data in this case it accepts only json data
	public String deleteAlien(@PathVariable("id") int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@GetMapping(path="/aliens",produces= {"application/json"})//produces is used to send only specific type of data in this case it sends only json data. we can also
	//@ResponseBody // we don't need to define the response body if we are using restcontroller annotation or if we are using the controller annotation then we need to mention responseBody annotation
	public List<Alien> aliens() {
		List<Alien> ans = repo.findAll();
		return ans;
	}
	
	@GetMapping("/getAlien/{id}")
	//@ResponseBody
	public Alien getAlien(@PathVariable("id") int aid) {
		Alien ans = repo.findById(aid).orElse(new Alien());
		return ans;
	}
}
 