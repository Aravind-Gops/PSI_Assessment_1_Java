class transpose
{
	public static void main(String[] args)
	{
		int[][] a={{10,20,30},{40,50,60}};
		int b=a.length;//row length
		int c=a[0].length;//column length
		System.out.println("Original array");
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		int[][] newa=new int[3][2];
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<c;j++)
			{
				newa[j][i]=a[i][j];//transposing
			}
		}
		System.out.println("Transpose array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(newa[i][j] +" ");
			}
			System.out.println();
		}
	}
}
		