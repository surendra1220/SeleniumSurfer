package cracker;

public class SubClass1 extends AbstractClass
{
	public void compute()
	{
		System.out.println("I am in Sub Class");
	}


public static void main(String[] args) {
	
	SubClass1 sc = new SubClass1();
	sc.compute();
	

}
}