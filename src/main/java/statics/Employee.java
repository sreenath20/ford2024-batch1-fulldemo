package statics;

public class Employee {
    String name; // instance data member i.e new memory will get allocated
    static String companyName="Ford"; // only once memory will get allocated/ no-instance / static data member i.e  class loader will allocate memory

    public String  getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String newName){
      Employee.companyName = newName;
    }

}
