import java.util.PriorityQueue;
public class list4{
public static void main(String[] args){
PriorityQueue<Integer> obj=new PriorityQueue<Integer>();
obj.add(10);
obj.add(30);
obj.add(20);
obj.add(40);

System.out.println(obj);
obj.offer(5);
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove();
System.out.println(obj);
obj.remove();
System.out.println(obj);

}
}