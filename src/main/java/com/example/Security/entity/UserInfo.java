package com.example.Security.entity;

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
@Table(name="tbl_userinfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String uname;
	private String pwd;
	private String role;
	
	public String setUname(String uname) {
		return this.uname=uname;
	}
	
	
	public String getUname() {
		// TODO Auto-generated method stub
		return uname;
	}
	public String setPwd(String pwd) {
		return this.pwd=pwd;
	}
	


	public String getPwd() {
		// TODO Auto-generated method stub
		return pwd;
	}
	public String setRole(String role) {
		return this.role=role;
	}
	

	public String getRole() {
		// TODO Auto-generated method stub
		return role;
	}
	public int setId(int id) {
		// TODO Auto-generated method stub
		return this.id=id ;
	}


	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
}