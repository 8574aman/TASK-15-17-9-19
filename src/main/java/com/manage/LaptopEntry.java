package com.manage;



import org.hibernate.Session;

public class LaptopEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Util().getSF().openSession();
	
		laptop l1 = new laptop("L111", "DELL", 50000);
		laptop l2 = new laptop("L112", "HCL", 70000);
		laptop l3 = new laptop("L113", "HP", 40000);
		
		
		org.hibernate.Transaction tr=session.beginTransaction();
		
		session.save(l1);
		session.save(l2);
		session.save(l3);
		
		tr.commit();
		session.close();
		System.out.println("Data Added");
	

	}

}
