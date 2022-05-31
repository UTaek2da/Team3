package com.utaek.domain;

import lombok.Data;

@Data
public class PageVO {
	//05.26 장동연
	//05.31 손유택 승택이형 오류 체크용
	private int startPage;
	private int endPage;
	private boolean prev, next;
	private int total;
	private Criteria cri;
	
	public PageVO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0)) *10;
		this.startPage = this.endPage - 9;
		int realEnd = (int)(Math.ceil((total * 1.0) /cri.getAmount()));
		if(realEnd < this.endPage) {this.endPage = realEnd;}
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
