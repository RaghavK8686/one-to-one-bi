package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 5);
		if(vehicle !=null)
		{
			System.out.println("vehicle id is :"+vehicle.getId());
			System.out.println("vehicle name is :"+vehicle.getName());
			System.out.println("vehicle cost is :"+vehicle.getCost());
			System.out.println("charsy id is:"+vehicle.getCharcy().getId());
			System.out.println("charsy number is:"+vehicle.getCharcy().getCharcyNumber());
			System.out.println("charsy type is :"+vehicle.getCharcy().getType());
		}
		else
		{
			System.out.println("vehicle not found");
		}
		
	}

}
