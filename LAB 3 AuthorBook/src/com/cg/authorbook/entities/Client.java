
package com.cg.authorbook.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		// first define few products before we place order

		Author aut =new Author();
		aut.setId(100);
		aut.setName("Adrika");
		
		Book bk = new Book();
		bk.setIsbn(1);
		bk.setTitle("English");
		bk.setPrice(2);
		
		bk.addAuthor(aut);
		
		em.persist(bk);
		
		System.out.println("Added orders along with order details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
