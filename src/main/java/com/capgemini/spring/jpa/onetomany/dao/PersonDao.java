package com.capgemini.spring.jpa.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.spring.jpa.onetomany.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}
