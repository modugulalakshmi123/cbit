import java.util.Scanner;
public class search{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the array len");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the array elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter Key to find its index");
int Key=sc.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i]==Key)
{
System.out.println("The "+Key+" finds at index :"+i);
}
}
}
}
