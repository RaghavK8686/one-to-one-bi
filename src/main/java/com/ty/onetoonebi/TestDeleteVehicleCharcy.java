package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicleCharcy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		Vehicle vehicle=entityManager.find(Vehicle.class, 4);
		if(vehicle!=null)
		{
			entityManager.remove(vehicle);
		}
		else
		{
			System.out.println("vehicle not found");
		}
		entityTransaction.commit();
	}

}
