package com.utaek.domain;

import lombok.Data;

@Data
public class FaqVO {
	//05.26 장동연
	private int faqidx;
	private String username;
	private String faqcontents;
	private String faqregdate;
	private int faqcnt;
}
