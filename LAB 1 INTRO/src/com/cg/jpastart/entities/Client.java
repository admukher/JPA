package com.cg.jpastart.entities;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

	

	public class Client {

		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			
			Greet greet = new Greet();
			// greet.setname("ria");
			greet.setMessage("Welcome to JPA!");
			
			em.persist(greet);
			
			System.out.println("Added greeting to database.");

			em.getTransaction().commit();
			em.close();
			factory.close();
		}
	}


