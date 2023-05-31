import java.util.Scanner;
public class main13{
public static void main(String[] args)
{
String s1="mani";
String s2="man";
if(s1==s2){
System.out.println("references are not equal");
}
else
{
System.out.println("reference are not equal");
}
if(s1.equals(s2))
{
System.out.println("strings are equal");
}
else
{
System.out.println("String are unequal");
}
}
}