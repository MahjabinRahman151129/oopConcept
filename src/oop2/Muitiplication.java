package oop2;

import oop1.object;

public class Muitiplication extends object  {
	
	
	void Multilpei (int a, int b) {
		int m = a*b;
		System.out.println(m);
	}
	
	void Multilpe(double a ,double b) {
		double m =a*b;
		System.out.println(m);
	}
	
	

	public static void main(String[] args) {
		
		
		 Muitiplication m1 =new  Muitiplication();
		 m1.Multilpe(4, 6);
		 m1.Multilpe(9.3, 7.9);
		 
		 
		 //(100+100+100)*10
         m1.add(100, 100, 100);
        int  sum6 =m1.add(100, 100, 100);
       m1.Multilpe(sum6, 10);
		m1.add(6.8, 9.3, 9.0);
		
		
		
		
		
		

	}

}
