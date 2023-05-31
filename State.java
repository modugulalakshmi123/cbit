import java.util.Scanner;
public class State{
public static void main(String args[]){
Scanner Sc=new Scanner(System.in);
int age=Sc.nextInt();
if(age>=18)
{
System.out.println("you are eligible for vote");
}
else{
System.out.println("you are not eligible for vote");
}
}
}