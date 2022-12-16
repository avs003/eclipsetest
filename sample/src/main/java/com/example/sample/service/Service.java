package com.example.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sample.model.Details;

@org.springframework.stereotype.Service
public class Service {
	
	
	List<Details> list=new ArrayList<>();
	public Service() {
		System.out.println("service layer created");
		list.add(new Details("akash", 10));
		list.add(new Details("anirudh", 20));
		list.add(new Details("tarun", 22));
		list.add(new Details("abhishek", 20));
	}
	
	
	//alldetails
	public List<Details> getAllDetails()
	{
		return list;
	}
	
	//specific deatils
	public Details getDetail(int age)
	{
		for(Details d:list)
		{
			if(d.getAge()==age)
			{
				return d;
			}
		}
		return null;
	}
	
	
	//save
	public void saveDetails(Details details)
	{
		this.list.add(details);
	}
	
	
	//update
	public void updateDetail(Details details)
	{
		for(Details d:list)
		{
			if(d.getAge()==details.getAge())
			{
				d.setName(details.getName());
			}
		}
	}
	
	//delete
	public void deleteDetails(int age)
	{
		list.remove(age);
	}
	
	 

}
