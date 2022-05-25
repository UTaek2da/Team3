package com.utaek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utaek.domain.TestVO;
import com.utaek.mapper.HomeMapper;

@Service
public class HomeSerivceImpl implements HomeSerivce {
	
	@Autowired
	private HomeMapper mapper;
	
	@Override
	public TestVO test01() {
		TestVO vo = mapper.test01();
		return vo;
	}
}
