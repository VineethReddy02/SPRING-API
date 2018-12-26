package com.springapi.SpringAPI;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "collection01")
public class Data_Entity {
	
	@Id
	private String Unique_ID;
	private String name;
	
	private int age;
	
	public Data_Entity() {
		
	}
	
	public Data_Entity(String unique_ID, String name, int age) {
		super();
		Unique_ID = unique_ID;
		this.name = name;
		this.age = age;
	}

	public String getUnique_ID() {
		return Unique_ID;
	}

	public void setUnique_ID(String unique_ID) {
		Unique_ID = unique_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
