package com.classmiss.ClassyMissyBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class Supplier {
@Id
@GeneratedValue
int supid;

@Column
@Size(min=2,max=10,message="Name has to be between 2 to 10 characters")
String supname;

@Column
@Size(min=2,max=10,message="Address has to be between 2 to 10 characters")
String supaddr;

public int getSupid() {
	return supid;
}
public void setSupid(int supid) {
	this.supid = supid;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}
public String getSupaddr() {
	return supaddr;
}
public void setSupaddr(String supaddr) {
	this.supaddr = supaddr;
}

}
