import java.util.Scanner;//importing scanner 
class equal{//main class
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number1");//getting user input
	int num1=s.nextInt();
	System.out.println("Enter number2");//getting user input
	int num2=s.nextInt();
	System.out.println("Enter number3");//getting user input
	int num3=s.nextInt();
	System.out.println("Enter number4");//getting user input
	int num4=s.nextInt();
	if(num1==num2 && num1==num3 && num1==num4)//comparing
	{
		System.out.println("Equal");
	}
	else
	{
		System.out.println(" Not Equal");
	}
}
}