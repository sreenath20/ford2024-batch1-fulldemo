public class EmployeeDriver {

    public static void main(String [] args){

        Employee firstEmployee;
        firstEmployee = new Employee();// default constructor

        firstEmployee.display();// this=#1000
        Employee secondEmployee = new Employee();
        secondEmployee.display(); // this=#2000

        Integer data;
        Employee thirdEmployee = new Employee(77,"Sreenath",20000.0,"Bangalore");
        thirdEmployee.display();
        //thirdEmployee.name = "ford";
        thirdEmployee.setName("Ford");
        thirdEmployee.display();
        System.out.println("Name of third employee :"+ thirdEmployee.getName());
    }
}
