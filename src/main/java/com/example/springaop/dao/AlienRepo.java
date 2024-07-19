package com.example.springaop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.springaop.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path="aliens")// this spring rest data (where we can perform most of the controller operations without creating the controller methods for each requests need to add rest repositories dependency)
public interface AlienRepo extends JpaRepository<Alien, Integer> {
	//@Query("from alien where name=?1 order by id")
	//List<Alien> Names(String name);
}
