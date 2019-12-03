class high
{
public static void main(String[] args)
{
B b=new B();
B b1=new B("java");
}
}
class A
{
A()
{
System.out.println("hey A");
}
A(String str)
{
System.out.println("A "+str);
}
}
class B extends A
{
B()
{
System.out.println("hello B");
}
B(String str)
{
System.out.println("B "str);
}
}
