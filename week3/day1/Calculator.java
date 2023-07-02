package week3.day1;

public class Calculator {
	

	public void Add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	

public void multiple(double u,double w) {
	System.out.println(u*w);
}
public void multiple(float q,float i) {
	System.out.println(q*i);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
Calculator obj=new Calculator();
obj.add(5, 4, 8);
obj.Add(5, 6);
obj.multiple(4, 04);
obj.multiple(0.2f, 1.2f);
}
	
}
	
