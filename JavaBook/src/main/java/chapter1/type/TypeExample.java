package chapter1.type;

public class TypeExample {
    public static void main (String[] args) {
        /* 정수형 타입 */
        // Type - [byte]
        System.out.println("=======================");
        System.out.println("byte [-128 ~ 127]");
        System.out.println("=======================");

        // Type - [char]
        System.out.println("===========================================");
        System.out.println("char [0 ~ 65535] | 2byte");
        System.out.println("===========================================");

        // Type - [short]
        System.out.println("===========================================");
        System.out.println("short [-32,768 ~ 32,767] | 2byte");
        System.out.println("===========================================");

        // Type - [int]
        System.out.println("===============================================================");
        System.out.println("int [-2,147,483,648 ~ 2,147,483,647] | 4byte");
        System.out.println("===============================================================");

        // Type - [long]
        System.out.println("===============================================================");
        System.out.println("long [-2**63 ~ 2**63 -1] | 8byte");
        System.out.println("===============================================================");

        /* 실수형 타입 */
        // Type - [float]
        System.out.println("=====================================================");
        System.out.println("float [(+/-)1.4E45 ~ (+/-)3.4028235E38] | 4byte");
        System.out.println("=====================================================");

        // Type - [double]
        System.out.println("==================================================================");
        System.out.println("double [(+/-)4.9E-324 ~ (+/-)1.7976931348623157E308] | 8byte");
        System.out.println("==================================================================");

        /* 실수형 타입 */
        // Type - [boolean]
        System.out.println("=====================================================");
        System.out.println("boolean [true | false] | 1byte");
        System.out.println("=====================================================");
    }
}
