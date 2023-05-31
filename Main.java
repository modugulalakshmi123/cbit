import java.util.Scanner;
public class Main{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
float o=sc.nextFloat();
float t=sc.nextFloat();
float m=sc.nextFloat();
if(o<t){
float i=(y*o)+(x*o);
if(i==m){
System.out.println("monthly pass");
}
else{
System.out.println("ow+tw");
}
}
else{
System.out.println("  I   ");
}
}
}


