package interfaces;

public class Client {

    public static void main(String [] args){

        TV tvRef; // allowed to create reference variable of interface
      // parent = new TV(); // error: Parent is abstract; cannot be instantiated
        BWTV bwtvObj = new BWTV();
       // bwtvObj.display();
        tvRef = bwtvObj;
        tvRef.display();

        ColorTV colorObj = new ColorTV();
       //colorObj.display();
        tvRef = colorObj;
        tvRef.display();

        Parent parent;
        Child child;
        ChildImpl objRef = new ChildImpl();
        objRef.functionOne();
        objRef.functionTwo();
        parent = objRef;
        parent.functionOne();
        //parent.functionTwo();
        child = objRef;
        child.functionTwo();
        child.functionOne();

        C obj = new C();
        A aRef=obj;
        aRef.displayOne();
        B bRef=obj;
        bRef.displayTwo();
        A.functionStatic();
        //aRef.functionStatic();
        obj.functionDefault();
        aRef.functionDefault();

    }
}
