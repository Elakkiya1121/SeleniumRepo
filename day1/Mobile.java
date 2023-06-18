package week1.day1;

public class Mobile {

	public void sendSMS() {
		System.out.println("Hello Testleaf");
	}	
	
 protected void allowVoicecall() {
	 System.out.println("This Protected method");
	}
	
	private void takeVideo() {
System.out.println("This is from Private");
	}


	public static void main(String[]  args) {
		
		Mobile mb=new Mobile();
				mb.sendSMS();
				mb.allowVoicecall();
				mb.takeVideo();
	}
}
