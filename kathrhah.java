class katrhah
{
public static void main(String args[])
{
Mythread obj=new Mythread();
obj.start();
System.out.print("Check in main"+obj.isAlive());
}
}
class Mythread extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.print("Thread is"+isAlive());
}
}
}