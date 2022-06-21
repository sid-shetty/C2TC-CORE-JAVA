
package access_modifier;
//conclusion is static inner class 
public class Outer_class {
	int x  =10; 
	
	                        static class inner{
		               public void main() {
		            	   System.out.println("I am inner class");
		            	   
		               }
	                                     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_class.inner obj = new Outer_class.inner() ;// object creation
	 obj.main();
	}

}


