package com.utaek.domain;

import lombok.Data;

@Data
public class PayVO {
	//05.26 장동연
	private int payidx;
	private String username;
	private String pcode;
	private int cartidx;
	private String payregdate;
	private int payallprice;
	private int paycheck;
	private String paytype;
	private String paysize;
	private String paycolor;
}
