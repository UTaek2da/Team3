package com.utaek.domain;

import lombok.Data;

@Data
public class CartVO {
	//05.26 장동연
	private int cartidx;
	private String username;
	private String pcode;
	private int cartamount;
	private int cartprice;
	private String cartsize;
	private String cartcolor;
	private int cartcheck;
}
