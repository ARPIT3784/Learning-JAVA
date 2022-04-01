package Unit_01;
/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
 * 		-Arithmatic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

public class p3_task02_OperatorsInJava {

	public static void main(String[] args) {
		

	}

}
class op
{
	void unaryop() {
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
	}
	void arithmatic()
	{
		int a=10,b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	void shiftop()
	{
		System.out.println(10<<2);
		System.out.println(10>>2);
	}
	void relationalop() {
		int a=10,b=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	void bitwise()
	{
		int a=10,b=5,c=20;
		
	}
	
}
	