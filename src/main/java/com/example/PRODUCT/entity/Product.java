package com.example.PRODUCT.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="table_product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String price;
	private String department;
	
	
	
	public String setDepartment(String department) {
		 return this.department=department;
	}
	

	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}
	public String setName(String name) {
		 return this.name=name;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String setPrice(String price) {
		 return this.price=price;
	}
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
