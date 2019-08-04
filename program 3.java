class P3
{
	public static void main(String args[])
	{
		long i,J,max,max2,a=0,c=0;
	 long n=600851475143,max=0;	
	 	for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a=i;
				c=0;
				
				for(J=1;J<=i;J++)
				{
					if(a%J==0)
					{
						c++;
					}
				}
		if(c==2)
					{
						max2=i;
						if(max2>max)
						{
							max=max2;
						}
						}
				}
				c=0;
				}
			System.out.println("largest prime factor is ="+max);
		}
	}
    
    