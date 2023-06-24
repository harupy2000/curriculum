package check;

import constants.Constants;

public class Main {
	
	private String firstName = "渡井";
	private String lastName = "晴彦";
	
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド　→　" + firstName + lastName);
	}
	
	public static void main(String[] args) { 
		
		Main m1 = new Main();
		m1.printName("渡井", "晴彦");
		
		Pet p1 = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		p1.introduce();
		
		RobotPet r1 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE); 
		r1.introduce();
	}
}
