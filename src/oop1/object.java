package oop1;
public class object {
	int x;
	int y;
	
	private void add() {
		int sum=x+y;
		
	System.out.println(sum);
	
	}
	
	public	int add(int x,int y,int z) {
		int sum =x+y+z;
		System.out.println(sum);
		return sum;
		
		}
	
	protected double add(double x,double y,double z) {
		double sum=x+y+z;
		return sum;
	}

	
	
	public static void main(String[] args) {
		object a1 = new object();
		a1.x=5;
		a1.y=7;
		a1.add();
		int sum3=a1.add(7, 9, 3);
		System.out.println(sum3);	

		
		//System.out.println(sum3);
		
		double sum2=a1.add(10, 20, 30);
		System.out.println(sum2);
		
		
		
		
		object a2 = new object();
		a2.x=15;
		a2.y=45;
		System.out.println(a2.add(10, 10, 30));
		
		
	}
	
		
	}
		
	


