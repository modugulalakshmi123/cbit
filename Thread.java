import java.util.*;
public class Thread{
public static void main (String[] args){
Thread t=new Thread("cbit");
t.Start();
String str=t.getName();
System.out.println(str);
}
}
public void run() {
System.out.println("Running " +  threadName );
try {
for(int i = 4; i > 0; i--) {
System.out.println("Thread: " + threadName + ", " + i);
 Thread.sleep(50);
}
} catch (InterruptedException e) { 
System.out.println("Thread " +  threadName + " interrupted.");
}
System.out.println("Thread " +  threadName + " exiting.");
}
     }   
}




