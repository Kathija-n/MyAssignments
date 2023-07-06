package week3.assignment;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		Automation program = new Automation();
		program.python();
		program.ruby();
		program.Java();
		program.Selenium();

	}

	public void Selenium() {
		System.out.println("This is a Selenium Programming");
		
	}

	public void Java() {
		System.out.println("This is a Java Programming");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is a ruby Programming");
		
	}

}
