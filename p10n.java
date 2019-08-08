class p10n{
	public static void main(String args[])
	{
	    boolean cnd=true;
	    long sum=0;
		
		for(long i=2;i<2000000;i++)
		{ 
		    double sr=Math.sqrt(i);
		    long d=Math.round(sr);
		    while(d>1)
		    {
		        cnd=true;
		        if(i%d==0)
		        {
		            cnd=false;
		            break;
		          }
		          d--;
		      }
		      if(cnd)
		      {
		          sum=sum+i;
		  }
		  }
		  System.out.println(sum);
}
}