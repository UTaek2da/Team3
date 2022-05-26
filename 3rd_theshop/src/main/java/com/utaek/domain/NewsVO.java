package com.utaek.domain;

import lombok.Data;

@Data
public class NewsVO {
	//05.26 장동연
	private int newsidx;
	private String username;
	private String newscontents;
	private String newsthumbnail;
	private String newsregdate;
	private int newscnt;
}
