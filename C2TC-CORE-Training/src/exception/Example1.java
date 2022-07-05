package exception;

public class Example1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
  try
  {
	int i, sum;
	sum=10;
	for(i=-1;i<3;++i)
	{
		sum=sum/i;
		System.out.print(i);
	}
	
  }
  catch(ArithmeticException e)
  {
	  System.out.println("1");
	  
  }
}

}