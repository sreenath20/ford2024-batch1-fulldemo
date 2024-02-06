package inheritance;

public class Child extends Parent{ // except private datamember & methods will get inherited
    private String name ="India";

    public void newDisplay(){ // new functionality
        System.out.println("Child new display :" + super.name + "Child name:"+this.name); // using super we can access immediate parent data
        super.featureOne();
    }
    public void featureOne(){ // modify existing  functionality overriding parent method
        System.out.println("Child feature One");
    }
}
