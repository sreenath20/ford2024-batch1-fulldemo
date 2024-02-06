public class DemoDebugging {

    public static  void main(String [] args){
        int firstNumber =0;
        int secodNumber = 1;
        int thirdNumber;
        for(int i=0;i<4;i++){
            thirdNumber = firstNumber+secodNumber;
            System.out.println("i:"+ thirdNumber);
           firstNumber=secodNumber;
           secodNumber=thirdNumber;
            functionOne();
        }
    System.out.println("Application Ends Successfully ");
    }
    static void functionOne(){
        System.out.println("Function One");
    }
}
