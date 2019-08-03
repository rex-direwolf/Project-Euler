class p5{
	public static void main(String args[])
	{
		int i,J,min,c=0;
		for(i=1;;i++)
		{
			for(J=1;J<=20;J++)
			{
				if(i%J==0)
				{
					c=1;
				}
				else{
					c=0;
					break;
					}}
					if(c==1)
					{
						min=i;
						break;
						
					}
				}
			System.out.println(min);	
			
	
			
								
	}
}
