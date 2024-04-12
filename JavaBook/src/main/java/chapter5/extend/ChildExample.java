package chapter5.extend;

public class ChildExample extends ParentExample {
    public static void main(String[] args) {
        ChildExample child = new ChildExample();
        int result = 0;

        // private 속성은 같은 패키지에서 상속하여도 참조 불가!
        // System.out.println("parent_value1 : " + child.parent_value1);
        System.out.println("child used parent_value2 : " + child.parent_value2);
        System.out.println("child used parent_static_value : " + child.parent_static_value);

        child.printHelloWorld();

        result = child.onSum(32, 48);

        System.out.println("child onSum result : " + result);
    }
}
