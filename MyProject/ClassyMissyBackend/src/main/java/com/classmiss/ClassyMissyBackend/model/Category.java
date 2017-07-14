package com.classmiss.ClassyMissyBackend.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class Category {
	@Id
	@GeneratedValue
	int catid;
	@Column
	@Size(min=2,max=10,message="Name has to be between 2 to 10 characters")
	String catname;
	
	@Column
	@Size(min=2,max=10,message="Describtion has to be between 2 to 10 characters")
	String catdesc;

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public String getCatdesc() {
		return catdesc;
	}

	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}
}
