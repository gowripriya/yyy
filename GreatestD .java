public class GreatestD {

	
	public static void main(String[] args) {
		int x=43;
		int y=91;
		int z=183;
		int minimum;
		if(x<y&&x<z)
		{
			minimum=x;
		}
		else if(y<z)
		{
			minimum=y;
		}
		else
		{
			minimum=z;
		}
		System.out.println(minimum);
		while(minimum>0)
		{
			int p=43%minimum;
				
			int q=91%minimum;
						
			int r=183%minimum;
			if((p==q)&&(q==r))
			{
				System.out.println(minimum);
				break;
			}
			minimum--;
		}
		
		

	}

}
