package dynamicpolymorphism;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();

        Parent parentRef; // reference variable
       // Child childRef;

//        parentRef = parent;
//        parentRef.display();
//        parentRef = child;
//        parentRef.display();
        Scanner scanner = new Scanner(System.in);
       while(true) {

           System.out.println("Enter choice 1: parent , 2: child, 0: exit");
           Integer choice = scanner.nextInt();

           if(choice.equals(0))break;

           if (choice.equals(1)) {
               parentRef = parent;
           } else {
               parentRef = child;
           }
           parentRef.display();
       }

    }
}
