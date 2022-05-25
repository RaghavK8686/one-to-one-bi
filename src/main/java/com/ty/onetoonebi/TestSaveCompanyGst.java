package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompanyGst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company =new Company();
		company.setName("Dell");
		company.setPhone(987412574l);
		company.setWeb("google");
		
		Gst gst=new Gst();
		gst.setCountry("INDIA");
		gst.setGstNumber("POIUY741LK");
		gst.setState("DELHI");
		
		gst.setCompany(company);
		company.setGst(gst);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
	}

}
