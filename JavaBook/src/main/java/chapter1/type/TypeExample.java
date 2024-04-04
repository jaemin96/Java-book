package chapter1.type;

public class TypeExample {
    public static void main (String[] args) {
        /* 정수형 타입 */
        // Type - [byte]
        // byte val1 = 128; // error!
        byte val1 = 127;
        System.out.println("=======================");
        System.out.println("byte [-128 ~ 127]");
        System.out.println("byte value : " + val1);
        System.out.println("=======================");

        System.out.println();

        // Type - [char]
        // char val2 = ''; // error! ==> ' '으로 수정
        // String 의 경우에는 String val2 = ""; 처럼 공백없이 선언가능
        char val2 = 65;
        System.out.println("===========================================");
        System.out.println("char [0 ~ 65535] | 2byte");
        System.out.println("char value 65 : " + val2);
        System.out.println("===========================================");

        System.out.println();

        // Type - [short]
        // short val3 = 32768; // error!
        short val3 = 100;
        System.out.println("===========================================");
        System.out.println("short [-32,768 ~ 32,767] | 2byte");
        System.out.println("short value : " + val3);
        System.out.println("===========================================");

        System.out.println();

        // Type - [int]
        // int val4 = 3000000000; // error!
        int val4 = 564;
        System.out.println("===============================================================");
        System.out.println("int [-2,147,483,648 ~ 2,147,483,647] | 4byte");
        System.out.println("int value : " + val4);
        System.out.println("===============================================================");

        System.out.println();

        // Type - [long]
        // long val5 = 3000000000; // error! ==> 정수형 값을 초과하는 경우 L 을 붙여야함
        long val5 = 3000000000L;
        System.out.println("===============================================================");
        System.out.println("long [-2**63 ~ 2**63 -1] | 8byte");
        System.out.println("long value : " + val5);
        System.out.println("===============================================================");

        System.out.println();

        /* 실수형 타입 */
        // Type - [float]
        // float val6 = 1.23; // error! ==> 실수는 자동으로 double 형으로 인식하므로 float 타입에 바로 적용 불가
        // 이 같은 경우 실수형 뒤에 f나 F를 붙여야함
        float val6 = 1.23f;
        float val7 = 0.1234567891234567890f;
        System.out.println("=====================================================");
        System.out.println("float [(+/-)1.4E45 ~ (+/-)3.4028235E38] | 4byte");
        System.out.println("float value : " + val6);
        System.out.println("float detail test value : " + val7);
        System.out.println("=====================================================");

        System.out.println();

        // Type - [double]
        double val8 = 1.23;
        double val9 = 0.1234567891234567890;
        System.out.println("==================================================================");
        System.out.println("double [(+/-)4.9E-324 ~ (+/-)1.7976931348623157E308] | 8byte");
        System.out.println("double value : " + val8);
        System.out.println("double detail test value : " + val9);
        System.out.println("==================================================================");

        System.out.println();

        /* 실수형 타입 */
        // Type - [boolean]
        boolean val10 = true;
        boolean val11 = false;
        System.out.println("=====================================================");
        System.out.println("boolean [true | false] | 1byte");
        if(val10) System.out.println("val10 is true " + val10);
        if(!val11) System.out.println("!val11 is true " + val11);
        System.out.println("=====================================================");
    }
}
