
import java.util.ArrayDeque;
public class list3{
public static void main(String[] args){
ArrayDeque<Integer> obj=new ArrayDeque<Integer>();
obj.add(10);
obj.add(20);
obj.add(30);
obj.add(40);
obj.addFirst(90);
System.out.println(obj);
obj.addLast(20);
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove(10);
System.out.println(obj);




}
}