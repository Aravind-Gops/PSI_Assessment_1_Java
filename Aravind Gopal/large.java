import java.util.*;
class large{
	public static void main(String[] args)
	{
		int[] array={1,4,17,7,25,3,100};;
		Scanner s=new Scanner(System.in);//user input for large number
		int a=s.nextInt();
		Arrays.sort(array);//sorting
		int b=array.length;
		System.out.println("Large numbers");
		for(int i=a-1;i>a-b;i--)
		{
			System.out.println(array[i]);//printing
		}
	}
}
		