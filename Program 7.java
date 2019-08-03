class p7{
	public static void main(String args[])
	{
		int i,J,c,n=0;
		for(i=2;;i++)
		{ 
			c=0;
			for(J=1;J<=i;J++)
			{
				if(i%J==0)
{
	c++;
}
}
if(c==2)
{
	n++;
}
if(n==10001)
{
	
	System.out.println(i);
	break;
}
}
}}
