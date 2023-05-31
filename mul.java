import java.util.Scanner;
public class mul{
public static void main(String[] args){
try{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
float c=a/b;
System.out.println(c);
}
catch (Exception e){
System.out.println("some thing went wrong");
}
}
}