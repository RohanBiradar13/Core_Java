package com.code;

import java.sql.Date;
import java.text.SimpleDateFormat;



public class Employee {
private int id;
private String name;
private double salary;
private Department dept;
private Date joinDate;
public static SimpleDateFormat sdf;
static {
	sdf =new SimpleDateFormat("dd-mm-yy");
}
public Employee(int id, String name, double salary, Department dept, Date joinDate) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
	this.joinDate = joinDate;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary +
			", dept=" + dept + ", joinDate=" + sdf.format(joinDate);
}


}
