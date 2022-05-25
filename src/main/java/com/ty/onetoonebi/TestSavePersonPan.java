package com.ty.onetoonebi;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("Divya");
		person.setEmail("div@gmail.com");
		person.setPhone(7412326510l);

		Pan pan = new Pan();
		pan.setName("Divya");
		pan.setPanNumber("POIU974OH");
		pan.setAddress("Mahabalipuram");

		person.setPan(pan);
		pan.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
