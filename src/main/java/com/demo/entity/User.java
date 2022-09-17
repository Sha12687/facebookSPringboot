package com.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="testUser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ID;
private String uid;
private String password;

public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + ID+ ", uid=" + uid + ", password=" + password + "]";
}
}
