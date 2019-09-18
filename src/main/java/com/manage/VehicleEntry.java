package com.manage;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Util().getSF().openSession();

		Vehicle v1= new Vehicle(101, "Audi", "A8", 15000000);
		Vehicle v2= new Vehicle(102, "Jaguar", "XF", 35000000);
		Vehicle v3= new Vehicle(103, "RangeRover", "Landcruizer", 5000000);
		System.out.println("RECORD..");
		Transaction tr = session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}
