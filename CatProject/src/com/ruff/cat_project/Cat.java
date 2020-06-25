package com.ruff.cat_project;

public class Cat {
	
	private String name;
	private String gender;
	private int age; 
	private boolean isAMouser = true;
	private double weight;
	


	public Cat(String name, String gender, int age, boolean isAMouser, double weight) {
		this.name = name;
		this.gender = gender;
		this.age = age; 
		this.isAMouser = isAMouser;
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAMouser() {
		return isAMouser; 
		}
	
	public void setAMouser(boolean isAMouser) {
		this.isAMouser = isAMouser;
	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		System.out.println(this.name + " Gender is... " + this.gender);
		return this.gender;
	}

	public Integer getAge() {
		System.out.println(this.name + " Age is.. " + this.age);
		return this.age;
		
	}
	
	public void meow(int numTimes) {
		for(int i = 0; i < numTimes; i++) {
			// (starting point - most start at 0; end point of loop "less than"; i++ is shortcut for i = -+1
		
		System.out.println(this.name + " is Meowing");
		}
}
}
