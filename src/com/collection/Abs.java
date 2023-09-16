package com.collection;

abstract class AA{
      	void  m1() {
		System.err.println("inside methid of parent m1 ");	
	}

    int x=10;
	 abstract int m2();
}

class BB extends AA{
	@Override
	int m2() {
	  System.err.println("inside method  child m2()");
		return 10;
	}	 
}

public class Abs {
	public static void main(String[] args) {	
	BB  bb = new BB();
		  bb.m1();
		  bb.m2();
		  System.out.println(bb.x);						
	}

}
