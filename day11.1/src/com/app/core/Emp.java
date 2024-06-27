package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
 private int id;
 private String name;
 private double salaray;
 private Department dept;
 private Date joinDate;
 public static SimpleDateFormat sdf;
 static {
	 sdf=new SimpleDateFormat("dd-MM-yyyy");
 }
public Emp(int id, String name, double salaray, Department dept, Date joinDate) {
	super();
	this.id = id;
	this.name = name;
	this.salaray = salaray;
	this.dept = dept;
	this.joinDate = joinDate;
}

public Emp(int id) {
	super();
	this.id = id;
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salaray=" + salaray + ", dept=" + dept + ", joinDate=" + sdf.format(joinDate)
			+ "]";
}
@Override
 public boolean equals(Object o) {
	System.out.println("in equals method");
	if(o instanceof Emp) {
		return this.id==((Emp)o).id;
	}
	return false;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getSalaray() {
	return salaray;
}

public void setSalaray(double salaray) {
	this.salaray = salaray;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}
}
