public class mul1{
public static void main(String[] args){
Thread t=Thread.currentThread();
t.setName("cbit");
t.setPriority(6);
System.out.println(t);
}
} 