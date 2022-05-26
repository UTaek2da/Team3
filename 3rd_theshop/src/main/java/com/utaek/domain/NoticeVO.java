package com.utaek.domain;

import lombok.Data;

@Data
public class NoticeVO {
	//05.26 장동연
	private int noticeidx;
	private String username;
	private String noticecontents;
	private String noticeregdate;
	private int noticecnt;
	private String noticethumbnail;
}
