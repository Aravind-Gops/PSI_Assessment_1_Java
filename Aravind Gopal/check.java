import java.util.Scanner;//importing
class check{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1");//user input
		double n1=s.nextDouble();
		System.out.println("Enter number2");
		double n2=s.nextDouble();
		if((n1>0 && n1<1) && (n2>0 && n2<1))//compare
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}