package com.utaek.domain;

import lombok.Data;

@Data
public class ReviewVO {
	//05.26 장동연
	private int reviewidx;
	private String username;
	private String pcode;
	private String reviewregdate;
	private String reviewcontents;
	private int reviewcheck;
	private int reviewstar;
	private int reviewpopup;
	private int reviewlikecnt;
}
