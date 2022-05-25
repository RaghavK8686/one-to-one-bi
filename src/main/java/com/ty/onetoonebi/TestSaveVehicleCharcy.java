package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharcy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("BMW");
		vehicle.setCost(340000.00);
		
		Charcy charcy=new Charcy();
		charcy.setType("Treck");
		charcy.setCharcyNumber("47JUF7548NV");
		
		vehicle.setCharcy(charcy);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}

}
