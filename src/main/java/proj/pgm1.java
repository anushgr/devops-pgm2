package proj;

public class pgm1 {
	public static String display(int m) {
		if (m<0 || m>100) {
			return "Invalid";
		}
		else if (m<40) {
			return "Fail";
		}
		else {
			return "Pass";
		}
	}
	
	public static void main(String args[]) {
		System.out.println(display(55));
	}
}
