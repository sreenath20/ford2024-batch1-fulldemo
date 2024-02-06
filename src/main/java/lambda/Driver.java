package lambda;

import java.util.Locale;
import java.util.function.*;

public class Driver {
    public static void main(String[] args){

        //DemoFunction demoLambda= (n1,n2)->System.out.println("Mul "+ n1*n2);
        DemoFunction demoLambda= (n1,n2)-> {
            System.out.println("*************");
             return n1*n2;
        };
       int result= demoLambda.display(5,9);
    System.out.println("result:"+result);

    Consumer<Integer> intConsumer = (i)->System.out.println("i="+i);
    intConsumer.accept(555);

        Supplier<Double> piSupplier = ()->3.14;
        System.out.println("pi:"+piSupplier.get());

        Function<String,String> stringFunction = (s)-> s.toUpperCase();
        System.out.println("String in Upper case:"+ stringFunction.apply("India"));

        BiFunction<String,String,Boolean> stringCompare = (s1,s2)->s1.equals(s2);
        System.out.println("compare 2 strings: "+ stringCompare.apply("Ford","ford"));

        Predicate<Integer> isOdd = (n)->(n&2)!=0;

        System.out.println("Test 7 odd? :"+ isOdd.test(7));

    }
}
