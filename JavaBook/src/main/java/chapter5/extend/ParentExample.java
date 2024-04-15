package chapter5.extend;

public class ParentExample {
    private int parent_value1;
    public int parent_value2;
    static int parent_static_value;

    public String text;

    public ParentExample() {

    }
    public ParentExample(String text) {
        this.text = text;
    }

    public void printHelloWorld () {
        System.out.println("Hello World !!!");
    }

    int onSum (int x, int y) {
        return x + y;
    }

    static {
        parent_static_value = 2;
    }
    public static void main(String[] args) {
        ParentExample parent = new ParentExample();
        int result = 0;

        System.out.println("parent_value1 : " + parent.parent_value1);
        System.out.println("parent_value2 : " + parent.parent_value2);
        System.out.println("parent_static_value : " + parent.parent_static_value);

        parent.printHelloWorld();

        result = parent.onSum(32, 48);

        System.out.println("parent onSum result : " + result);
    }
}
