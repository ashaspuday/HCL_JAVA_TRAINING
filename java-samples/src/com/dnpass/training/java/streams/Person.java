package com.dnpass.training.java.streams;

public class Person {
protected String firstName;
protected String lastName;
protected Integer age;
public Person(String firstName, String lastName, Integer age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
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
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

}