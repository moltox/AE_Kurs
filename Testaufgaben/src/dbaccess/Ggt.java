package dbaccess;

public class Ggt {
	public static void main(String args[])
	{
	  int a = 32;
	  int b = 42;
	  int puffer1 = 0;
	  int puffer2 = 0;
	  for (int i = 0; i < 30; i++) {
		  puffer1 += a;
		  System.out.print(puffer1+"-");
		  puffer2 += b;
		  System.out.print(puffer2+"|");
		  System.out.println();
	  }
	  
	}
}
