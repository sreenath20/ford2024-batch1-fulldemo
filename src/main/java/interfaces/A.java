package interfaces;

public interface A {
    public static final String name= "Name A";
    String city = "Chennai"; // by default public static final
    void displayOne();
    public static void functionStatic(){ // global implementation // by default public
        System.out.println("Static method of A");
    }
     public default void functionDefault(){ // by default public
        System.out.println("Default method of A");
    }
}
