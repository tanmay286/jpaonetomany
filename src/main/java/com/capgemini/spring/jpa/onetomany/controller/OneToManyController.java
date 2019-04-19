package com.capgemini.spring.jpa.onetomany.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.jpa.onetomany.dao.PersonDao;
import com.capgemini.spring.jpa.onetomany.entity.Certificates;
import com.capgemini.spring.jpa.onetomany.entity.Person;

@RestController
public class OneToManyController {

	@Autowired
	PersonDao personDao;
	
	@RequestMapping("/")
	public void add() {
		
		Set<Certificates> set = new HashSet<Certificates>();
		Certificates certificate1 = new Certificates(101,"java","Oracle");
		Certificates certificate2 = new Certificates(201,"Aws","Amazon");
		Certificates certificate3 = new Certificates(202,"Azure","Microsoft");
		set.add(certificate1);
		set.add(certificate2);
		Person person = new Person(101,"John",set);
		personDao.save(person);
		
		
		Set<Certificates> set1 = new HashSet<Certificates>();
		set1.add(certificate3);
		Person person1 = new Person(102,"Alex",set1);
		personDao.save(person1);
		
	}
	
	@RequestMapping("/get")
	public Person get() {
		Person person = personDao.findById(101).get();
		return person;
	}
	
	@RequestMapping("/get1")
	public Person get1() {
		Person person1 = personDao.findById(102).get();
		
		return person1;
	}
	
	@RequestMapping("/all")
	public List<Person> all() {
		Set<Integer> ids= new HashSet<Integer>();
		ids.add(101);
		ids.add(102);
		List<Person> person = personDao.findAllById(ids);
		return person;
		
	}
}
