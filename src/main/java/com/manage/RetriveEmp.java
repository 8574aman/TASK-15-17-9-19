package com.manage;

import java.util.List;

import org.hibernate.Session;

public class RetriveEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Util().getSF().openSession();
		Emp e = session.get(Emp.class, 4001);
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		System.out.println(e.getSal());
		System.out.println(e.getLaptop());
		
		List<Project> l1=e.getProject();
		List<Vehicle> l2=e.getVehicles();
		
		for(Project list:l1)
		{
			System.out.println(list);
		}
		for(Vehicle list:l2)
		{
			System.out.println(list);
		}
	}

}

