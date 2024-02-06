public class Calculator {
    Integer dataOne;
    Integer dataTwo;
    public Calculator(){

    }
    public Calculator(Integer numberOne, Integer numberTwo){
        this.dataOne = numberOne;
        this.dataTwo=numberTwo;
    }
    public void display(){
        System.out.println("No Data:");
    }
    public void display(Integer data){
        System.out.println("Integer Data:"+data);

    }
    public void display(Double data){
        System.out.println("Double Data:"+data);

    }
    public void display(Double doubleData,Integer intData){
        System.out.println("Double Data:"+doubleData + "Integer :"+intData);

    }
    public void display(Integer intData,Double doubleData){
        System.out.println("Double Data:"+doubleData + "Integer :"+intData);

    }


}
