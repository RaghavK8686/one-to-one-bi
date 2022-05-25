package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompanyGst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class,1);
		
		if(company!=null)
		{
			Gst gst=company.getGst();
			
			System.out.println("comapny id is :"+company.getId());
			System.out.println("company name is :"+company.getName());
			System.out.println("company phone is :"+company.getPhone());
			System.out.println("company web is :"+company.getWeb());
			System.out.println("gst id is :"+company.getGst().getId());
			System.out.println("gst number is :"+company.getGst().getGstNumber());
			System.out.println("gst state is :"+company.getGst().getState());
			System.out.println("gst country is :"+company.getGst().getCountry());
		}
		else
		{
			System.out.println("no data found");
		}
	}

}
