package week3.day1;

public class BMW extends Car{
	
	public void applyBrake() {
		System.out.println("ABS brakes");
	
	}
	
	public void applyBrake(int x) {
		System.out.println("Vehicle brakes");
	}
	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.applyBrake();
	}
}
