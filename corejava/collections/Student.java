package com.corejava.collections;

public class Student {
	String name;
	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", Mno=" + Mno + ", Email=" + Email + "]";
	}
	Integer Id;
	Long Mno;
	String Email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Long getMno() {
		return Mno;
	}
	public void setMno(Long mno) {
		Mno = mno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setGender(String string) {
		// TODO Auto-generated method stub
		
	}

}
