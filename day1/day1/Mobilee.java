package week1.day1;

public class Mobilee {
	public void makeCall()
	{
		System.out.println("Make a Call");		
		String Mobilemodel="Apple";
		float Mobileweight=5.9f;
		System.out.println(Mobilemodel);
        System.out.println(Mobileweight);
	}
	public void sendMsg()
	{
		System.out.println("Hello Everyone");
		boolean Isfullcharged=true;
		int Mobilecost=580000;
		System.out.println(Isfullcharged);
        System.out.println(Mobilecost);
		
	}
	public static void main(String[] args) {
		Mobilee phone= new Mobilee();
		phone.makeCall();
		phone.sendMsg();
		System.out.println("Thia is my mobile");
	}

}
