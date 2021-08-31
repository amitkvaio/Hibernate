package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager09
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		
		String sql = "select * from Person";
		
		List<Object[]> list = s1.createSQLQuery(sql).list();//returning list of object
		
		for (Object[] obj: list)//list of object arrays// each object containing multiple column 
		{
			for (Object col : obj)
			{
				System.out.print(col.toString()+" ");
			}
			System.out.println();
			//System.out.println(obj[0]+" "+obj[1]+" "+obj[2]+" "+obj[3]+" "+obj[4]+" "+obj[5]+" "+obj[6]);
		}
		System.out.println("done");
		
	}
}

