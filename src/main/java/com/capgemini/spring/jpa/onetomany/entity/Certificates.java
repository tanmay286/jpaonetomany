package com.capgemini.spring.jpa.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Certificates {
	
	@Id
	private int certificateId;
	private String certificatename;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "personId")
	private Person person;
	
	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificates(int certificateId, String certificatename, String description) {
		super();
		this.certificateId = certificateId;
		this.certificatename = certificatename;
		this.description = description;
	}
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificatename() {
		return certificatename;
	}
	public void setCertificatename(String certificatename) {
		this.certificatename = certificatename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", certificatename=" + certificatename
				+ ", description=" + description + ", person=" + person + "]";
	}
	


	
}
