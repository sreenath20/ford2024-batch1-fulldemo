
public class Demo {
    public static void main( String [] args){ // driver program
        //first instruction// entry point
        System.out.print("hello");
        System.out.println("ford");
        int a = 0b100;
        System.out.println("a:" + a);
        double d = 100.5; // 100.5d / D
        System.out.println("d:" + d);
        float f = 100.5F;
        System.out.println("f:" + f);
        char c = 'c';
        System.out.println("c:"+c);

        Byte bB = 127;

        byte bb = 100;
        System.out.println("Compare bB & bb: " + Byte.compare(bB,bb));

       // bb.toString();//byte cannot be dereferenced   bb.toString();
        String s = bB.toString();
        System.out.println("s:"+s);

        Short sh = Short.valueOf(s);
        System.out.println("sh:"+sh);

        System.out.println(Integer.BYTES);
        Integer i = 2147483647;
        System.out.println("i:"+i);

        System.out.println(Long.BYTES);

        Integer i3= 100;
        Integer i2 = new Integer("100");
        Integer i4 = Integer.valueOf("200");
        System.out.println("i2:"+i2);
        System.out.println("i4:"+i4);

        // operator precedence
        int ii = (10*(1)+10);
        System.out.println("ii:"+ii);
        Integer number =100;
        //Float number =10.5;
        String c1 = "Ford"; // declaration strict typed programming language

        String c2 = new String("Ford");

        if(c1 == c2) // equality of reference [address]
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        if(c1.equals(c2)) // to check value []
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        {
            int iii=0;
            if ((++iii >0) || (++iii>20)){

            }
            System.out.println("iii:"+iii);
        }
        System.out.println("Name :"+ ((false)?"Ford":"India"));

        System.out.println("Name :"+ ((false)?"Ford":((true)?"India":"Delhi")));

        i=10;


        i+=10; //// i=i+10;
        System.out.println("i+= :"+i);
        int date = 23012024;// 5/2=2
        System.out.println("year:" + date % 10000); // extract last digits
       date = date / 10000;

        System.out.println("Month:" + date % 100 );
        date = date / 100;
        System.out.println("Date:" + date % 100 );

       //if(100 == 200)


    }
}
