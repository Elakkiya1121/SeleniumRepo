package week3.day1;

public class StudentInfo {

	public void getStudentInfo(int x) {
		System.out.println("ID -"+x);
	}
	public void getStudentInfo(int x , String y) {
		System.out.println(x +y);
		
	}
	
	public void getStudentInfo(String h ,int k) {
		System.out.println(h+k);
		
	}
	public static void main(String[] args) {
		StudentInfo obj=new StudentInfo();
		obj.getStudentInfo(1121);
		obj.getStudentInfo(1121, "Elakkiya");
obj.getStudentInfo("elakkiya1121.rak@gmail.com", 985467895);				
	}
}
