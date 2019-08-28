package org.rough;

public class A {
	
	String[] a = new String[10];
	int i=0;
	
	public void add(String x)
	{
		a[i]=x;
		i++;
	}
	
	public static void main(String[] args) {
		
		A a= new A();
		a.add("Abc");
		a.add("xyz");
		System.out.println(a.a[0]);
	}

}
