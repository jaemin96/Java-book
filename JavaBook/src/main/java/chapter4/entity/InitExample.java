package chapter4.entity;
public class InitExample {

    byte byte_value;
    int int_value;
    short short_value;
    long long_value;

    float float_value;
    double double_value;

    boolean bool_value;

    public static void main(String[] args) {
        InitExample Init = new InitExample();

        System.out.println("byte_value : " + Init.byte_value);
        System.out.println("int_value : " + Init.int_value);
        System.out.println("short_value : " + Init.short_value);
        System.out.println("long_value : " + Init.long_value);
        System.out.println("float_value : " + Init.float_value);
        System.out.println("double_value : " + Init.double_value);
        System.out.println("bool_value : " + Init.bool_value);
    }
}
