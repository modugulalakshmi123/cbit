class Multi  Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
}
}
public Class withmultiThre{
public static void main(String[] args){
for(int i=0;i<=5;i++)
{
System.out.println("Im main thread");
}
Multi t1=new Multi();
t1.start();
}
}
