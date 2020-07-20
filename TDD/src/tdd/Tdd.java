package tdd;

public class Tdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String header = "abcd";
		header = header.startsWith("a") ? header.substring(1) : header;
		System.out.println(header);
	}

}
