package Unit_03;
import java.util.*;
import java.util.InputMismatchException;

/*
 * Exception Handling
 * - When we compile a java code ,the compiler is responsible for finding out the syntactic and semantic issues in java code
 * -There are some exceptions in java we can not catch them at compile time
 * -Only when we run the code the only we get to know if the exception has occurred or not
 *  but definitely we could have return a handle to catch those
 */
public class P14_ExceptionHandlingInJava {

	public static void main(String[] args) {
		
         ExceptionInJava obj=new ExceptionInJava();
        // obj.basicException();
         obj.handleException();
        // obj.mutipleCatch();
         obj.inputMismatchException();
        //obj.stackOverFlowError(1);
         obj.indexOutOfBoundException();
         obj.nullPointerException();
         try {
			obj.useOfThrow(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
         obj.useOfThrows_And_Finally();
	}

}
class ExceptionInJava
{   
	//compiler can not catch this exception at compile time
	void basicException()
	{
		int b=0;
		int a=100/b;
		System.out.println(a);
	}
	void handleException()
	{
		try { 
			//Sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		} 
		//Rest of the code
		System.out.println("Rest of the code");
	}
	void mutipleCatch()
	{
		try { 
			//Sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		} 
		//Child class exception comes before Parent class exception
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}  
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void inputMismatchException()
	{   
		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		System.out.println("You have entered: "+number);
		sc.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input mismatch issue!");
		}
	}
	void stackOverFlowError(int i) 
	{    
		
		try {
		while(i>0)
		{
			i++;
			stackOverFlowError(i);
		}
	   }
	   catch(Exception e)
	   {
		    System.out.println(e.getMessage());
	   }
	}
	
	void indexOutOfBoundException()
	{   
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[10]);//accessing index out of bound
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("rest of the code");
	}
	void nullPointerException()
	{
		try {
			String str=null;  
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("rest of the code");
	}
	void useOfThrow(int age) throws Exception         // Throws informs that the method contains an exception but not resolved
	{
		if(age<18)
		{
			throw new Exception();
		}
		else
		{
			System.out.println("You are allowed to enter");
		}
		
	}
	void useOfThrows_And_Finally()
	{
		//useOfThrow(17);    // show an exception error for not handling the exception in method useOfThrow
		                    // compiler knows that exception come here and do use of TRY CATCH
		
		try {
			useOfThrow(17);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Always excuted");
		}
	}
}