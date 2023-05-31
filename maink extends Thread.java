public class mul2
{
public void run()
{
System.out.println("this thread is internaly called by Start/run()");
}
}
public Class withmultiThre{
public static void main(String[] args){
for(int i=0;i<=5;i++)
{
System.out.println("Im main thread");
}
maink m=new maink();
m.run();
}

   