
public class Employee{ // User defined data type
        // data members
          private String name ;//= "Ford";
    private Integer id;//=100;
    private String address;//="Delhi";
    private Double salary;//=5555.55;
    // overloaded Constructors
    // default constructor
        public Employee(){ // initialize data members
            this.name="India";
            this.id=100;
            this.salary=5000.0;
            this.address="India";
        }
//        public Employee(){
//
//        }
        // parameterised constructor
        public Employee(Integer id,String name,Double salary,String address){ // different signature
            this.id = id;
            this.name=name;
            this.salary=salary;
            this.address=address;
        }

        void display(){ //this=1000
            System.out.println("name:"+this.name);
            System.out.println("id:"+this.id);
            System.out.println("address:"+this.address);
            System.out.println("salary:"+this.salary);
        }

        public void setName(String newName){
            this.name = newName;
        }
        public String getName(){
            return this.name;
        }


}
