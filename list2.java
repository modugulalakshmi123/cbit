import java.util.ArrayList;
import java.util.Iterator;
public class list2{
public static void main(String[] args){
ArrayList<String> obj=new ArrayList<String>();
obj.add("arpita");
obj.add("tejashwini");
obj.add("vinod");
obj.add("kiran");
obj.add("rajeshwari");
System.out.println(obj);
Iterator it=obj.iterator();
while(it.hasNext())
{
if(it.next().equal("vinod"))
{
it.remove();
}
}
System.out.println(obj);

}
}

