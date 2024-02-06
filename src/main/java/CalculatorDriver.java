public class CalculatorDriver {

    public static void main(String [] args){

        Calculator casio = new Calculator();
        casio.display();
       //casio.display("Ford");
        casio.display(555);
        casio.display(55.5d,44);
        casio.display(25,35.5d);
    }
}
