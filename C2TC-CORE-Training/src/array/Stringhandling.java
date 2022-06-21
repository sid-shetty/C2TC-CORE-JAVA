package array;

public class Stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Siddhant");
		s.concat("shetty");
		System.out.println(s);

		StringBuffer s1=new StringBuffer("Siddhant");
		s1.append(" shetty");
		System.out.println(s1);
		System.out.println(s.replace('d','m'));
		System.out.println(s.equalsIgnoreCase("siddhant"));
	}

}