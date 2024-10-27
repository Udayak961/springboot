package com.example.Security.service;

import org.springframework.stereotype.Service;

import com.example.Security.entity.UserInfo;

@Service
public interface UserInfoService {
	public String addUser(UserInfo userInfo);
}