package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGstCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst=entityManager.find(Gst.class,1);
		
		if(gst!=null)
		{
			Company company=gst.getCompany();
			
			
			System.out.println("gst id is :"+gst.getId());
			System.out.println("gst number is :"+gst.getGstNumber());
			System.out.println("gst state is :"+gst.getState());
			System.out.println("gst country is :"+gst.getCountry());
			System.out.println("company id :"+gst.getCompany().getId());
			System.out.println("company name is "+gst.getCompany().getName());
		
		}
		else
		{
			System.out.println("no data found");
		}
	}

	}

