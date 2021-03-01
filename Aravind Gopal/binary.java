import java.util.*;//import
class binary{
	public static void main(String[] args)
	{
		System.out.println("Enter number to be converted");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();//user input
		String b=Integer.toBinaryString(a);//conversion to binary
		System.out.println("binary value is:" + b);
		int c=b.length();
		int d=0;
		for(int i=0;i<c;i++)
		{
			if(b.charAt(i)=='0')
			{
				d++;//finding zeros
			}
		}
		System.out.println("number of zeros:" +d);
	}
}
	