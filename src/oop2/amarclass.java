package oop2;

import oop1.object;

public class amarclass extends object{
	
	void same(int r,int s)
	{
		
	}
	
	int same(int r,int t,int s)
	{
		s=r+t;
		return s;

	}
	  
	
	
	public static void main(String[] args) {
		
		amarclass raya1 = new amarclass() ;
		
		double f1=raya1.add(700, 800, 900);
		double g1=raya1.add(f1, 0, 50);
			
	System.out.println(g1);
		
		
		
		

	}

}
