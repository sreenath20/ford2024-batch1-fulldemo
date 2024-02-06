package threads;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String [] ars){

        System.out.println("Excuting main:"+
                Thread.currentThread().getName());

        TaskOne taskOne = new TaskOne();
        Thread thread = new Thread(taskOne,"Th1");
        thread.start();

        try {
            System.out.println("thred 1 entering join state");
            thread.join(0);
        }
        catch (  InterruptedException e ){
            System.out.println("thred 1 :"+e.getMessage());
        }
        Thread threadTwo = new Thread(taskOne,"Th2");
        threadTwo.start();

    }
}
