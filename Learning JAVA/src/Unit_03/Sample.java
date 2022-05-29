package Unit_03;

//if there is an exception in try block but there is no appropriate catch block for that exception still finally would run..... (finally always runs)

import java.util.InputMismatchException;

public class Sample {

	public static void main(String[] args) {
		try {
			int a = 100/0;
			System.out.println(a);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}	
		//if there is no exception finally would always run
		finally	{
			System.out.println("\ndone");
		}
		
		System.out.println("handled");
	}
}