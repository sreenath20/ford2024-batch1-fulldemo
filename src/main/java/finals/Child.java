package finals;


//public class Child extends Parent { //Cannot inherit from final 'finals.Parent'
//
//}

public class Child extends Parent {
    // overridden method is final
     void displayName(){ // overriding method
        // this.companyName = "India"; //Cannot assign a value to final variable 'companyName'
        System.out.println("Name:"+this.name);
    }
}