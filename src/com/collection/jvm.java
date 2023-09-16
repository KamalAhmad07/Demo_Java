package com.collection;

class A{
	public void  m1(int  a){
		System.err.println("inside parent  method m1()");
		System.out.println("a = "+a);
              
	}
}


class B extends A{
	public  void m1(int  a){
		System.err.println("inside child m1()");
       System.out.println(a);
	}
}


public class jvm {

	   static int  x =10;
	 
	  public jvm() {
		
		}
	public static void main(String[] args) {
	 
		// jvm obj = new jvm();
		// int x=20;
		//    System.out.println("x = "+ jvm.x) ;
		//    System.out.println("local x = "+x);

		A a = new A();
		a.m1(20);

	  B b = new B()	;
	  b.m1(30);

	  A  a1 = new  B();
	  a1.m1(50);
	  
	 
	  
	}

	

	
	  
}
