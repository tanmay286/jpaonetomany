package com.capgemini.spring.jpa.onetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
	private Set<Certificates> certificates;
	public Person() {
		super();
	}
	
	public Person(int personId, String personName, Set<Certificates> certificates) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificates = certificates;
	}

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	public Set<Certificates> getCertications() {
		return certificates;
		
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certificates=" + certificates + "]";
	}
	

	
	
	
}
