class twod{
	public static void main(String[] args)
	{
		boolean[][] array={{true,false,true},{false,true,false}};
		int a=array.length;//row length
		int b=array[0].length;//column length
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(array[i][j])
				{
					System.out.print("t");
				}
				else
				{
					System.out.print("f");
				}
			}
			System.out.println("");
		}
	}
}

					