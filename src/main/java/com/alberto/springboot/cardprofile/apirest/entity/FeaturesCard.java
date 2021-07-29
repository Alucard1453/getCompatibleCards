package com.alberto.springboot.cardprofile.apirest.entity;

public class FeaturesCard {
	private String passion;
	private float salary;
	private int age;
	
	public FeaturesCard() {
	}

	public FeaturesCard(String passion, float salary, int age) {
		this.passion = passion;
		this.salary = salary;
		this.age = age;
	}

	public String getPassion() {
		return passion;
	}

	public void setPassion(String passion) {
		this.passion = passion;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
