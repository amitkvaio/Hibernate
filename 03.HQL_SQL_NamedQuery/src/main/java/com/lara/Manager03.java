package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();

		Query qr = s1.createQuery("select firstname,lastname,age from com.lara.Raja");

		/*List<Object[]> list = qr.list();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
		}*/

		List list = qr.list();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object[] obj = (Object[]) it.next();
			System.out.println("FIRST NAME-->" + obj[0] + "-LASTNAME-->" + obj[1] + "--AGE-->" + obj[2]);
		}
		System.exit(0);
	}
}
