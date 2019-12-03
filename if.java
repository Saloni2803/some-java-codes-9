import java.util.Scanner;
class ife
{
public static void main(String[] args)
{
int x,i=2,f=0;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
while(i<=(x/2))
{
if(x%i==0)
{
f=1;
break;
}
i++;
}
if(f==1)
System.out.print("not prime");
else
System.out.print("prime");


}
}       