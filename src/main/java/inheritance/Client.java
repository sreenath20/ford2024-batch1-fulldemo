package inheritance;

public class Client {
    public static void main(String[] args){
        Parent parent = new Parent();
        parent.display();
        parent.featureOne();

        Child child = new Child();
        child.display();
        child.newDisplay();
        child.featureOne();
        Parent parentRef;
        parentRef = child;
        parentRef.display();
        parentRef.featureOne();
       // parentRef.newDisplay();
        //child = parent;
        parent = child;


    }
}
