import java.util.*;
class jaava
{
public static void main(String[] args)
{
        Scanner s = new Scanner(System.in);
	int i,a[],n,c=0;
	System.out.println("enter size of array");	
	n = s.nextInt();
	a = new int[n];
	for(i=0;i<n;i++)
		a[i] = s.nextInt();
	s.close();
	for(i=0;i<n/2;i++)
	{
		if(a[i] == a[n-i-1])
		{
			c++;
		}
	}
	System.out.println(c);
	if(c!=0)
		System.out.println("same");
	else 
		System.out.println("different");
}
}