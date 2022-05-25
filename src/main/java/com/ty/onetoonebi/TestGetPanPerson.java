package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPanPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);
		System.out.println("pan name is :" + pan.getName());
		System.out.println("pan number is :" + pan.getPanNumber());

		Person person = pan.getPerson();
		System.out.println("name is :" + person.getName());
		System.out.println("Person email" + person.getEmail());

	}

}
