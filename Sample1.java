import java.util.Scanner;
public class Sample1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
if((year%4==0))
{
System.out.println(year+"is a leap year");
}
else if(year%400==0)		
{
System.out.println(year+"leap year");
}
else
{
System.out.println(year+"not leap year");
}

}
}