import java.util.Stack;
public class list1{
public static void main(String[] args){
Stack<Integer> obj=new Stack<Integer>();
obj.add(10);
obj.add(20);
obj.add(30);
obj.add(40);

System.out.println(obj);
obj.push(50);
System.out.println(obj);
obj.pop();
System.out.println(obj);
obj.pop();
System.out.println(obj);
obj.pop();
System.out.println(obj);
obj.pop();
System.out.println(obj);
obj.pop();
System.out.println(obj);

}
}
