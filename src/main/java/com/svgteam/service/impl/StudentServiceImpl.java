package com.svgteam.service.impl;

import org.springframework.stereotype.Component;

import com.svgteam.service.StudentService;



@Component
public class StudentServiceImpl implements StudentService {


	public StudentServiceImpl() {
		System.out.println("目标类被创建");
	}

	@Override
	public void insert() {
		System.out.println("数据插入");
		for(int in=0;in<100000;in++) {
			Object o=new Object();
		}
	}

}
