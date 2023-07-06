package week3.assignment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name ) {
		System.out.println(id +"\t"+ name);
	}
	public void getStudentInfo(String email, long phoneNumber ) {
		System.out.println(email + "\t" + phoneNumber);
	}
	
	public static void main(String[] args) {
		Students ch = new Students();
		ch.getStudentInfo(123456);
		ch.getStudentInfo(12345 , "Kathija");
		ch.getStudentInfo("kathijazayn212@gmail.com" , 7092475523l);

	}

}
