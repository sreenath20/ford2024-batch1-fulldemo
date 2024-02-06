package generics;

import inheritance.OrderPair;
import inheritance.Pair;
import interfaces.B;
import streams.Employee;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        Box<Integer> box = new Box(255);
        box.display();
        Box<String> stringBox = new Box<>("Ford");
        stringBox.display();

        Box<Employee> empBox = new Box<>(new Employee(1,"Ford India",4500.0));
        empBox.display();

        Pair<Integer,String> nameCode = new OrderPair<>(91,"India");
        System.out.println(nameCode.getKey() +":"+nameCode.getValue());

        Pair<String,Box<Employee>> StringBoxOfEmployee = new
                OrderPair<>("Ford",new Box<>(new Employee(1,"Sreenath",5555.5)));

        StringBoxOfEmployee.getValue().display();
        Box<Integer> boxGeneric = new Box(255);

        List<A> aList = new ArrayList<>() ;

        List<B> bList = new ArrayList<>() ;
        List<C> cList = new ArrayList<>() ;

       // boxGeneric.displayUpperGeneric(aList);
       // boxGeneric.displayUpperGeneric(bList);
        boxGeneric.displayUpperGeneric(cList);
        //boxGeneric.displayLowerGeneric(cList);
       // boxGeneric.displayLowerGeneric(bList);
        boxGeneric.displayLowerGeneric(aList);
    }
}
