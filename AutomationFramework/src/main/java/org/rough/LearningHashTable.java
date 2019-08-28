package org.rough;

import java.util.Hashtable;
import java.util.Map;

public class LearningHashTable {

	public static void main(String[] args) {
	
		Map<String,KeyRes> s = new Hashtable<String, KeyRes>();
		s.put("tc001", new KeyRes("open","Pass",""));
	   
		s.put("tc002", new KeyRes("login","Pass",""));
		s.put("tc003", new KeyRes("create","fail","Error"));
		s.put("tc004", new KeyRes("update","Pass",""));
		s.put("tc005", new KeyRes("delete","fail","Exception"));
		
	// System.out.println();
		
		//KeyRes rs=s.get("tc004");
		//System.out.println(rs.keyword);
		
		for(int i=0;i<s.size();i++)
		{
			String ss="tc00"+(i+1);
			System.out.print(ss +"  ");
			KeyRes rs1=s.get(ss);
			System.out.print(rs1.keyword);
			System.out.print("   ");
			System.out.print(rs1.status);
			System.out.print("  " );
			System.out.print(rs1.comments);
			System.out.println("");
		}
		
		
/*
	for(Map.Entry<String,KeyRes> entry:s.entrySet())
	 {
		 
		 String ke=entry.getKey();
		 KeyRes r =entry.getValue();
		 System.out.print(ke +" Results :");
		 System.out.print(r.keyword+" "+r.status+" "+r.comments);
		 System.out.println(" ");
	 }*/
		

	}

}
