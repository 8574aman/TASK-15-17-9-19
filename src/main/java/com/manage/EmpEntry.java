package com.manage;

import org.hibernate.Session;

public class EmpEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Util().getSF().openSession();
		
		Emp e1 = new Emp(4001, "AAA",52000,new laptop("L111"));
		e1.getProject().add(new Project(101));
		e1.getProject().add(new Project(102));
		
		
		//Emp e2 = new Emp(4002, "BBB",42000,new laptop("L112"));
		//Emp e3 = new Emp(4003, "CCC",62000,new laptop("L113"));
		//Project p2 = new Project(102, "RP","abc");
		//Project p3 = new Project(103, "HCL","PQR");
		
	
		org.hibernate.Transaction tr=session.beginTransaction();
		
		session.save(e1);
		//session.save(e2);
		//session.save(e3);
		
		tr.commit();
		session.close();
		System.out.println("Data Added");

	}

}
