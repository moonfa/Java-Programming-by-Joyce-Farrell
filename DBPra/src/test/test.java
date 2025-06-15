package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "C11175";
		String r = " YYU";
		if(s.matches("^[A-Za-z]\\d+$")) {
			System.out.println("match");
		}else {
			System.out.println("no match");
		}
		if(r.matches("^[A-Za-z\\s]+$")) {
			System.out.println("match all char and blank");
		}else {
			System.out.println("no match");
		}

	}

}
