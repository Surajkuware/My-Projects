package com.jspiders.Serializaiotndesrialization.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	
			String name;
			int Id;
			String City;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getId() {
				return Id;
			}
			public void setId(int id) {
				Id = id;
			}
			public String getCity() {
				return City;
			}
			public void setCity(String city) {
				City = city;
			}
			@Override
			public String toString() {
				return "Employee [name=" + name + ", Id=" + Id + ", City=" + City + "]";
			}
			
			
}
