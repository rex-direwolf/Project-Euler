class p5{
	public static void main(String args[])
	{
		int i=1,J,min=0,c=0;
		while(i>0)
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
					}}i++;
					if(c==1)
					{
						min=i-1;
						break;
						
					}
				}
			System.out.println(min);	
			
	
			
								
	}
}
