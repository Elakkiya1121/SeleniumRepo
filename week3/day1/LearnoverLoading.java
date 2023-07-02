package week3.day1;

public class LearnoverLoading {

	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add (int z,float y) {
		System.out.println(z+y);
	}
	public void add(int x,int y,float z) {
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		LearnoverLoading obj=new LearnoverLoading();
		obj.add(25, 04);
		obj.add(20, 2.4f);
		obj.add(15, 14, 1.6f);
	}
}
