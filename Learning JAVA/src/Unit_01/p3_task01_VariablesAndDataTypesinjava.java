package Unit_01;
/*
 Variable in java is a data conatiner that saves the data value during java program execute..
 
 Types of variable:
  -In java,there are 3 types of variable:
      
       #Local variable :: Declared inside the body of a method
       
       #Instance Variable :: Instance variable are defined without the STATIC keyword.
       -They are defined Outside a method declaration.
       -They are object inside specific and are known as instance variable.
       
       
       #Static Variable ::
       -Static variable are definedwith the STATIC keyword
       -Static variable are initialized only once,at the start of program execution.
       -These static variables should be initialized first, before the initialization of any 
       
-DATA TYPE IN JAVA  ? 
  -Reference  OneNotes
 
  */

public class p3_task01_VariablesAndDataTypesinjava {
	static int q=11;
	int p=10;

	public static void main(String[] args) {
		//valid Declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//valid Initialization
		pi = 3.14f;
		d = 20.22d;
		e ='v';
		
		
		a = 10;
		b = 10;
		c = 10;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		
		int myNum = 5; // Integer (whole number)
		float myFloatNum = 5.99f; //Floating Point number
		char myLetter = 'D';  //Character
		boolean myBool = true;   //BOOLEAN
		String myText = "HELLO";  //String
		
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		
		/*
		 JAVA Variable type Conversion & Type Casting : Details are in OneNotes 
		*/
		
		double f;
		int i = 10;
		f = i;  //Type Conversion
		
		
		double g = 10;
		int j;
		j = (int)g;      //Type Casting
		
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		
		
		 byte k = 10;   // 1 Byte
		 boolean l = true;   // 1 bit = true  od false only
		 long m = 10L;
		 float n = 1.2f;
		 double o = 1.2d;
		 
		 System.out.println(k);
		 System.out.println(l);
		 System.out.println(m);
		 System.out.println(n);
		 System.out.println(o);
		 
		 System.out.println(ABCD.j);   //DATA + Function/methods
		 //ABC.display();
		 
		 ABCD obj1 = new ABCD();
		 System.out.println(obj1.i++);
		 System.out.println(obj1.i);
		 
		 
		 ABCD obj2 = new ABCD();
		 System.out.println(obj2.i);
		 
		 
		//System.out.println(obj1.j++);
		//System.out.println(obj1.j);
		//System.out.println(obj2.j);
		 
		 System.out.println(ABCD.j++);
		 System.out.println(ABCD.j);
		 
		 ABCD.typeConversionANdTypeCasting();
	 
	}
	
	int n = 10;
	void display()
	{
		int a = 5;  //Local Variable
		System.out.println("This is Display Method...!!!");
		System.out.println(a);
	}

}

class ABCD {
	
	static int j = 10;   //class variable / static variable
	int i = 10;          //Instance variable
	
	static void display() {
		int a = 5;    //Local variable
		System.out.println("This is Display Method ...");
		System.out.println(a);
	}
	
	static void typeConversionANdTypeCasting() {
		/*
		 double f; //8byte = 64 bots/slots int i = 10; // 4 bytes =  32 bits/slots f = i; // 
		 Type Conversion System.out.println(a);
		 
		 double g = 10; // 64 int j; // 32 j = int(g);
		 */
		
		double f;       //64 slots
		int i = 10;     // 32 slots
		f = i;          // Type conversion
		System.out.println(f);
		
		
		double g = 10;  // 64
		int j ;   //32
		j = (int)g;    //type casting
		
		
		//32 bits = 64 bits
		
		System.out.println(i);
		System.out.println(j);
		
	}

}