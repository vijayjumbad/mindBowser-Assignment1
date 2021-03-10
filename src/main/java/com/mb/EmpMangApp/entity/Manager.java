package com.mb.EmpMangApp.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="MANAGER_MASTER")
public class Manager {

	@Id
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="DATE_OF_BIRTH")
	private Date dob;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="ROLES_MASTER",joinColumns = @JoinColumn(name="Email"))
	private Set<String> roles;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Manager [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", dob=" + dob + ", address=" + address + ", companyName=" + companyName + ", roles="
				+ roles + "]";
	}

	
	
	
}
