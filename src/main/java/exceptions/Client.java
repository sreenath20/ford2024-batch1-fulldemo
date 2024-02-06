package exceptions;

public class Client {

    public static void main(String [] args) {
       // int i = 10 / 0;
        Integer numbers[]={1,2,3,4};
//        String name=null;
//        System.out.println(name.toUpperCase());

        try {
          //  int ii = 10 / 0;

           // System.out.println(numbers[4]);
//            String name1=null;
//            System.out.println(name1.toUpperCase());

            try{
                            String name1=null;
            System.out.println(name1.toUpperCase());
            }catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("generic exception handling :"+e.getMessage());
        }
        finally { // to free my resources
            System.out.println("Am always executed");

        }
        try{
        functionA();}
        catch (NullPointerException e){
            System.out.println("Null ");
        }
        //
    System.out.println("End of application.");
    }
     static void functionA(){
         String name1=null;
            System.out.println(name1.toUpperCase());

     }
}
