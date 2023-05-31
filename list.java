import java.util.ArrayList;
public class list{
public static void main(String[] args){
ArrayListint obj=new ArrayListint();
obj.add(10);
obj.add("rao");
obj.add(10.23);
obj.add("naveen");
obj.add("narayana");
obj.add("saleem");

System.out.println(obj);
obj.remove(2);
System.out.println(obj);

//obj.clear();
System.out.println(obj);

System.out.println(obj.contains(10));
System.out.println(obj);

}
}

 