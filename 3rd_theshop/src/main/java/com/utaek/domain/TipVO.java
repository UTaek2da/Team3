package com.utaek.domain;

import lombok.Data;

@Data
public class TipVO {
	//05.26 장동연
	private int tipidx;
	private String username;
	private String tipcontents;
	private String tipregdate;
	private int tipcnt;
}
