package com.utaek.domain;

import lombok.Data;

@Data
public class ProductVO {
	//05.26 장동연
	private String pcode;
	private String username;
	private String pname;
	private int price;
	private int psellcnt;
	private int plikecnt;
	private String ptype;
	private String pthumbnail;
	private String pmainimage;
	private String pdetailimage;
	private String pregdate;
}
