package oop2;

import oop1.object;

public class division extends object {

	int x;
	int y;
	void  divi  () {
		
	   double   result = x/y;
  //System.out.println( result);
	}
	
	void divide(int a,int b,int c) {
		double d=(a+b)/c;
		//System.out.println(d);
	}
	double divide(double a,double b) {
		double d=a/b;
	//	System.out.println(d);
		return d;
	}
	
	public static void main(String[] args) {
		
	division raya = new division();
	
	//and perform (100+100+100)/50
	
		division d1 = new division() ;
		double q = d1.add(100, 100, 100);
		double s = d1.divide(q, 50);
		System.out.println(s);
		

	}

}
