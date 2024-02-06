package statics;

public class Driver {
    public static void main(String [] args){

        Employee emplOne = new Employee();
        Employee emplTwo = new Employee();
        Employee emplThree = new Employee();

        System.out.println("emp1 company:"+emplOne.getCompanyName());
        System.out.println("emp2 company:"+emplTwo.getCompanyName());

        emplOne.setCompanyName("India");
        System.out.println("emp3 company:"+emplThree.getCompanyName());

    }
}
