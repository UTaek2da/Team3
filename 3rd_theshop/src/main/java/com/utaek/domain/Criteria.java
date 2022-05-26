package com.utaek.domain;

import lombok.Data;

@Data
public class Criteria {
	//05.26 장동연
	private int pageNum; // 페이지 번호
	private int amount; // 한 페이지에 출력하고자 하는 자료의 개수
	
	private String type;	//검색어의 타입
	private String keyword;	//검색어
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
