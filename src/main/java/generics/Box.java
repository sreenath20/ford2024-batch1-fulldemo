package generics;

import java.util.List;

public class Box<T> {
    T data;

    public Box(T data) {
        this.data = data;
    }

    public void display(){
        System.out.println("Data : "+data);
    }

    public void displayUpperGeneric(List<? extends B> data){
        System.out.println("Type :"+ data);
    }

    public void displayLowerGeneric(List<? super B> data){
        System.out.println("Type :"+ data);
    }

}
