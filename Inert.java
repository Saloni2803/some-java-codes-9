import java.util.*;
class Inert
{
public static void main(String args[])
{
List<Integer> value=new ArrayList<Integer>();
value.add(123);
value.add(125);
value.add("Sharan");
System.out.print(value);
Iterator it=value.iterator();
System.out.print("Collection value");
/*while(it.hasNext());
{
System.out.print(it.next());
}*/
}
}