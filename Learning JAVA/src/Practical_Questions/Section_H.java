package Practical_Questions;

public class Section_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		testClass t = new testClass();
		int res = t.display(7);
		if(res == 0 )
			System.out.println("Not a prime number ");
		else 
			System.out.println("prime number ");
		
	}

}

interface In1
{
	
	int display (int p );
}
     
class testClass  implements In1
{
	
	public int display (int p )
	{
		for(int i = p -1 ; i>1 ; i--)
		{
			if(p%i == 0)
			return 0 ;
		}
		return 1;
	}
}