package Unit_01;
/*
 # control Statement and Conditional Statement :
  - Java provides three type of control flow Statement.
  -Decision Making Statements	
     -if statement
     -switch statement 
     
     
  -LOOP statement 
       - do while loop
       -while loop
       -for loop
       -for-each loop
       
  -JUMP statement     
        -break statement 
        -continue statement
 */
public class p4_task01_ControlAndConditionalStatement {

	public static void main(String[] args) {
		
		Statements obj = new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();

	}

}

class Statements {
	 void DecisionMakingStatements()
	 {
		 int x = 10;
		 int y = 12;
		 if(x+y < 10)
		 {
			 System.out.println("x + y is less than     10");
		 }
		 else
		 {
			 System.out.println("x + y is greater than 20  ");
		 }
		 
		 
		 int num = 2;
		 
		 // can we use instead of int as num ??
		 
		 switch (num) { // switch(expression)
		 case 0:  //case value1:
			 System.out.println("number is 0 ");
			 break;
		 case 1:  //case value2:
			 System.out.println("number is 1 ");
			 break;
		default:
			System.out.println("num ");		
		 }
	 }
	 
	 void LoopStatements()
	 {
		 /*
		  for(initialization, conditon,increment/decrement){//block of statement}
		  for(data_type var : array_name/collection_name){//statements}
		  */
		 
		 //for loop
		 
		 int sum = 0;
		 for(int j=1;j<=10;j++)
		 {
			 sum = sum +j;
		 }
		 System.out.println("The sum of first 10 Natural number is " + sum);
		 
		 //for each
		 String[] names = {"Java","C","C++","Python","Javascript"};
		 System.out.println("Printing the content of array names : \n");
		 for(String name : names)
		 {
			 System.out.println(name);
		 }
		 
		 /*
		  while(condition){// looping statement }
		  */
		 int i = 0;
		 System.out.println("printing the list of first 10 even numbers \n");
		 while(i<=10)
		 {
			 System.out.println(i);
			 i = i+2;
		 }
		 
		 /*
		  do-while  do{// statement } while (condition);
		  */
		 i=0;
		 System.out.println("Printing the list of first 10 even number  \n");
		 do {
			 System.out.println(i);
			 i=i+2;
		 }while(i<=10);
	 }
	 
	 
	 void JumpStatements()
	 {
		 //Break
		 for(int i=0;i<=10;i++)
		 {
			 System.out.println(i);
			 if(i==6)
			 {
				 break;
			 }System.out.println(i);
		 }
		 
		 // Continue
		 for(int i=0;i<=10;i++)
		 {
	
			 if(i==6)
			 {
				 continue;
			 }System.out.println(i);
		 }
		 
		 
	 }
}
