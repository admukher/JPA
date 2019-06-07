package com.cg.jpaauthor.main;

import com.cg.jpaauthor.entities.Author;
import com.cg.jpaauthor.service.AuthorService;
import com.cg.jpaauthor.service.AuthorServiceImpl;



public class Main {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
		AuthorService service = new AuthorServiceImpl();
		
		Author author = new Author();
		author.setAuthorId(100);
		author.setFirstName("Prem");
		author.setMiddleName("Kumar");
		author.setLastName("Dasari");
		author.setPhoneNo("8885835004");
		
		service.addAuthor(author);
		
		//at this breakpoint, we have added one record to table
		author = service.findAuthorById(100);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" first Name:"+author.getFirstName());
		System.out.println(" middle Name:"+author.getMiddleName());
		System.out.println(" last Name:"+author.getLastName());
		System.out.println("Phone number :"+author.getPhoneNo());
		
		author.setFirstName("Nitish Kumar Chandra");
		service.updateAuthor(author);
		
		//at this breakpoint, we have updated record added in first section
		author = service.findAuthorById(100);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" Name:"+author.getFirstName());
		System.out.println(" middle Name:"+author.getMiddleName());
		System.out.println(" last Name:"+author.getLastName());
		System.out.println("Phone number :"+author.getPhoneNo());
		
		//at this breakpoint, record is removed from table
		service.removeAuthor(author);
		System.out.println("End of program...");
		
		
		

	}
}
