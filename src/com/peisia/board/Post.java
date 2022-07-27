package com.peisia.board;

public class Post {
	int no;
	String id;
	String title;
	String content;
	String dateTime;
	
	Post(){
		
	}
	
	//alt + shift + s = generate constructor using fields
	//writing 
	public Post(int no, String id, String title, String content, String time) {
		super();
		this.no = no;
		this.id = id;
		this.title = title;
		this.content = content;
		this.dateTime = time;
	}
	
	//edit
	public void setData(String title, String content, String time) {
		this.title = title;
		this.content = content;
		this.dateTime = time;
	}
	
	
	
}
