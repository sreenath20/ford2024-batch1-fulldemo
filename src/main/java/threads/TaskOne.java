package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOne implements Runnable{
    @Override
    public void run() { // write business logic
        List<String> nameList = Arrays.asList("India",
                "Uk", "USA", "Canada");
        display(nameList);
    }
    //synchronized
     void display( List<String> nameList )  {

         System.out.println("Out side block:"+Thread.currentThread().getName());
       //  synchronized (this) {
            for (String name : nameList)
                System.out.println(name + ":" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println(e.getMessage());
            }
        }


}
