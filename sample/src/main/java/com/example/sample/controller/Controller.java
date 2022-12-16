package com.example.sample.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.Details;
import com.example.sample.service.Service;



@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	
	@RequestMapping(value = "/details")
	public List<Details> getDetails()
	{
		return service.getAllDetails();
	}
	
	
	@RequestMapping(value="/details/{age}")
	public Details getDetails(@PathVariable int age)
	{
		return service.getDetail(age);
	}
	@RequestMapping(value="details/save",method = RequestMethod.POST)
	public void saveDetails(@RequestBody Details details)
	{
		service.saveDetails(details);
	}
	
	@RequestMapping(value="/details/delete/{age}", method =RequestMethod.DELETE)
	public void deletedetails(@PathVariable int age)
	{
		service.deleteDetails(age);
	}
	@Re
	public void updatedetails(@PathVariable int age)
	{
		service.deleteDetails(age);
	}
	
}
