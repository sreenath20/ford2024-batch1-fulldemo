package inheritance;

public class Parent {
    // automatically insert default constructor public Parent()
    private Integer data=100;
    public String name = "Ford";

     void display(){
        System.out.println("Parent Display :"+data);
        //System.out.println("New changes");
    }
    public void featureOne(){ // modify this requirement
        System.out.println("Parent Feature One:"+data);
    }
}
