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
			
			Charcy charsy=vehicle.getCharcy();
			System.out.println("charsy id is :"+charsy.getId());
			System.out.println("charsy number  is :"+charsy.getCharcyNumber());
			System.out.println("charsy type is :"+charsy.getType());
		}
		else
		{
			System.out.println("vehicle not found");
		}	
	}
}
