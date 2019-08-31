class p7{
	public static void main(String args[])
	{
		int i,J,c,n=0;
		for(i=3;;i=i+2)
		{ 
			c=0;
			for(J=1;J<=i/2;J++)
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
if(n==10000)
{
	
	System.out.println(i);
	break;
}
}
}}
