package com.peisia.board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Post> posts = new ArrayList<>();
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm"));
		loop:
		while (true) {
			System.out.println("select cmd : 1.List, 2.Writing, 3.Edit, 4.Read, 5.Delete, e.Exit");
			String cmd = sc.next();

			switch (cmd) {
			case "1":
				System.out.println("List");
				for(int i=0; i<posts.size();i++) {
					System.out.print("no. "+posts.get(i).no);
					System.out.print("\t");
					System.out.print("Title: "+posts.get(i).title);
					System.out.print("\t");
					System.out.println("Id: "+posts.get(i).id);
				}
				
				break;

			case "2":
				System.out.println("Writing");
				
				System.out.println("No: ");
				int no = sc.nextInt();
				System.out.println("Id: ");
				String id = sc.next();
				System.out.println("Title: ");
				String title = sc.next();
				System.out.println("Content: ");
				String content = sc.next();
				
				System.out.println(no+"\t"+id+"\t"+title);
				System.out.println(content);
				String time = formatedNow;
				System.out.println(formatedNow);
				
				
				posts.add(new Post(no,id,title,content,time));
				break;
				
			case "3":
				System.out.println("Edit");
				
				System.out.println("Edit text no.");
				int editNo = sc.nextInt();
				Post e = null;
				
				for(int i=0; i<posts.size(); i++) {
					if(posts.get(i).no == editNo) {
						e = posts.get(i);
					}
				}
				System.out.println("Title: ");
				String edit_title = sc.next();
				e.title = edit_title;
				System.out.println("Content: ");
				String edit_content = sc.next();
				e.content = edit_content;
				System.out.println("Title: "+edit_title);
				System.out.println("content: "+edit_content);
				
				String edit_time = formatedNow;
				e.dateTime = edit_time;
				System.out.println(edit_time);
				

				e.setData(edit_title,edit_content,edit_time);
				
				break;

			case "4":
				System.out.println("Read");
				
				System.out.println("Text no. ");
				int readNo = sc.nextInt();
				
				for(int i=0; i<posts.size(); i++) {
					if(posts.get(i).no == readNo) {
						System.out.println("Id: "+posts.get(i).id);
						System.out.println("Title: "+posts.get(i).title);
						System.out.println("Content: "+posts.get(i).content);
					}
					
				}
				
				
				break;

			case "5":
				System.out.println("Delete");
				
				System.out.println("Deleted Text no. ");
				int delNo = sc.nextInt();
				
				for(int i=0;i<posts.size();i++) {
					if(posts.get(i).no == delNo) {
						System.out.println("Delete it!");
						posts.remove(i);
					}
				}
				
				break;
				
			case "e":
				System.out.println("EXIT");
				break loop;
			}
			
		}
			
 	}
}