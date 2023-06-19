package week1.day1;

public class NewMobile {
	public void sendSMS()
	{
		System.out.println("Hello");	
	}
	protected void allowVoiceCall()
	{
	System.out.println("Allow Voice Call");
	}
	private void takeVideo()
	{
		System.out.println("Take Video");
	}
	public static void main(String[] args) {
		NewMobile phone=new NewMobile();
		phone.sendSMS();
		phone.allowVoiceCall();
        phone.takeVideo();
	}

}
