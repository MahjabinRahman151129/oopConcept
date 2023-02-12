package oop1;

public class Subtraction extends object {

	 
		
		int sub(int a,int b) {
			int s=a-b;
			System.out.println(s);
			return s;
			
		}
		
		
		public static void main(String[]args) {
			 Subtraction s1=new  Subtraction();
			 s1.sub(90, 10);
			 
			 
			 
			 
			 //(100+100+100)-75
		       s1.add(100, 100, 100);
		    int store1= s1.add(100, 100,100);
		   int alif = s1.sub(store1, 75);
		   System.out.println(alif);
		
		}
		
		
	}


